package pl.softronic.szkolenia.java.gielda;

public class Gielda {
    private String nazwa = "";
    protected String adres = "";

    public static void main(String[] args) {
        Kontroler kontroler = new Kontroler();
        kontroler.uruchomProgram();
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }
}
