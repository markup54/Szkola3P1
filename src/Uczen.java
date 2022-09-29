public class Uczen extends  Osoba implements Dyzurny{
    private int nrUcznia;
    private static int licznik;

    public Uczen(String imie, int wiek) {
        super(imie, wiek);//wywołanie konstruktora klasy nadrzędnej
        //musi byc pierwszy wiersz konstruktora
        licznik++;
        nrUcznia = licznik;
    }

    @Override
    public String toString() {
        return "Uczen{" +
                "nrUcznia=" + nrUcznia +
                "imie = "+getImie()+
                "wiek = "+wiek+
                '}';
    }

    public static void wypiszDane(){
        System.out.println("Liczba uczniów"+licznik);
    }

    @Override
    public void dyzuruj() {
        System.out.println("zmazywanie tablicy");
    }
}
