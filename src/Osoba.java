public abstract class Osoba {
    private String imie;
    protected int wiek;

    public Osoba(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "imie='" + imie + '\'' +
                ", wiek=" + wiek +
                '}';
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        //TODO sprawdzić poprawność imienia czy same litery, czy pierwsza duza
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }
}
