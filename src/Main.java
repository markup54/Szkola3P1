public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        //Osoba jas = new Osoba("Jan",10);
        //System.out.println(jas.getImie());
        Uczen.wypiszDane();
        Uczen uczen1 = new Uczen("Szymon",17);
        System.out.println(uczen1);
        Uczen.wypiszDane();
        Uczen uczen2 = new Uczen("Szymuś",7);
        Uczen.wypiszDane();
        uczen1.dyzuruj();
        Nauczyciel nauczyciel1 = new Nauczyciel("Edmund",60, "przedmioty zawodowe");
        nauczyciel1.dyzuruj();
        System.out.println(nauczyciel1);
        Wychowawca nauczyciel2 = new Wychowawca("Kunegunda",20,"przedmioty zawodowe");
        Klasa kl1 = new Klasa(nauczyciel2,"3P");
        kl1.dodajUczniaDoKlasy(uczen2);
        kl1.dodajUczniaDoKlasy(uczen2);

    }
}