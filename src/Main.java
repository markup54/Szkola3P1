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
    }
}