import java.util.ArrayList;

public class Szkola {
    private static Szkola szkola = new Szkola();
    private ArrayList<Klasa> klasy = new ArrayList<>();

    private Szkola() {
    }
    public static Szkola getSzkola(){
        return szkola;
    }
    public void utworzKlase(Klasa klasa){
        klasy.add(klasa);
    }
    public void dodajUczniaDoKlasy(Uczen uczen, Klasa klasa){
        for (Klasa kl: klasy) {
            if(kl.getUczniowie().contains(uczen)){
                System.out.println("Najpierw wypisz"+ uczen+" z "+klasa);
                return;
            }

        }
        System.out.println("Poprawnie dodano "+uczen+"do klasy"+klasa);
        klasa.dodajUczniaDoKlasy(uczen);
    }
}
