import java.util.ArrayList;

public class Klasa {
    private Wychowawca wychowawca;
    private ArrayList<Uczen> uczniowie= new ArrayList<>();
    private String nazwa;

    public Klasa() {
    }

    public Klasa(ArrayList<Uczen> uczniowie) {
        this.uczniowie = uczniowie;
    }

    public Klasa(Wychowawca wychowawca, String nazwa) {
        this.wychowawca = wychowawca;
        this.nazwa = nazwa;
    }

    public Klasa(Wychowawca wychowawca, ArrayList<Uczen> uczniowie, String nazwa) {
        this.wychowawca = wychowawca;
        this.uczniowie = uczniowie;
        this.nazwa = nazwa;
    }

    /**
     * Metoda pozwala dodać ucznia do klasy jeżeli tam go nie ma
     * @param uczen  - obiekt klasy Uczen, który będzie dodawany do klasy
     * @return brak
     */
    public void dodajUczniaDoKlasy(Uczen uczen){
        if(uczniowie.contains(uczen)){
            System.out.println("Nie można dodać"+uczen+"do klasy");
        }
        else{
            uczniowie.add(uczen);
        }
    }
}
