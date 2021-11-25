package pl.softronic.szkolenia.java.gielda;

import java.time.LocalDate;


public class Zaglowka extends Pojazd {
    private int liczbaMiejsc = 5;
    private LocalDate dataPrzegladu;
    private float powZagli = 0.0f;
    private float dlugosc = 0.0f;

    public Zaglowka(String typPojazdu, String marka, int rok, Float cena, int idWlasciciel, int idSprzedawca) {
        super(typPojazdu, marka, rok, cena, idWlasciciel, idSprzedawca);
    }

    public Zaglowka(String typPojazdu, String marka, int rok, Float cena, int idWlasciciel, int idSprzedawca,
                    int liczbaMiejsc, LocalDate dataPrzegladu) {

        super(typPojazdu, marka, rok, cena, idWlasciciel, idSprzedawca);

        this.liczbaMiejsc = liczbaMiejsc;
        this.dataPrzegladu = dataPrzegladu;
    }

    public int getLiczbaMiejsc() {
        return liczbaMiejsc;
    }

    public void setLiczbaMiejsc(int liczbaMiejsc) {
        this.liczbaMiejsc = liczbaMiejsc;
    }

    public LocalDate getDataPrzegladu() {
        return dataPrzegladu;
    }

    public void setDataPrzegladu(LocalDate dataPrzegladu) {
        this.dataPrzegladu = dataPrzegladu;
    }

    public float getPowZagli() {
        return powZagli;
    }

    public void setPowZagli(float powZagli) {
        this.powZagli = powZagli;
    }

    public float getDlugosc() {
        return dlugosc;
    }

    public void setDlugosc(float dlugosc) {
        this.dlugosc = dlugosc;
    }

    @Override
    public String toString() {
        return "Zaglowka{" +
                "liczbaMiejsc=" + liczbaMiejsc +
                ", marka='" + super.getMarka() + '\'' +
                ", dataPrzegladu=" + dataPrzegladu +
                ", powZagli=" + powZagli +
                ", dlugosc=" + dlugosc +
                '}';
    }
}
