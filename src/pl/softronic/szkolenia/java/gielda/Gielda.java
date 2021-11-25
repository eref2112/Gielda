package pl.softronic.szkolenia.java.gielda;

import java.util.Vector;

public class Gielda {
    private String nazwa = "";
    protected String adres = "";

    Vector listaSamochodowOsobowych = new Vector();

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


    @Override
    public String toString() {
        return "Gielda{" +
                "nazwa='" + nazwa + '\'' +
                ", adres='" + adres + '\'' +
                '}';
    }


    public void przyjmijSamochodOsobowy(int idSprzedawcy, int idWlasciciela, SamochodOsobowy so) {
        int id = this.listaSamochodowOsobowych.size() + 1;
        so.setId(id);

        this.listaSamochodowOsobowych.add(so);
        System.out.println("Przyjąłem do sprzedaży samochód: " + so.toString());
    }


    public void wyswietlSamochodyOsobowe() {
        if (this.listaSamochodowOsobowych.size() == 0) {
            System.out.println("Nie ma samochodów na placu");
        } else {
            //System.out.println("Liczba samochodów na placu: " + this.listaSamochodowOsobowych.size()  );

            //Wstęp do pętli for
            for (int i = 0; i < this.listaSamochodowOsobowych.size(); i++) {
                System.out.println(this.listaSamochodowOsobowych.elementAt(i));
            }

        }

    }

    public void wycofajSamochod(int id) {
        int idPom = -1;

        for (int i = 0; i < this.listaSamochodowOsobowych.size(); i++) {
            /*
            !!! Ważny moment
            listaSamochodów jest "Raw", czyli bez deklaracji typu obiektow na liście, czyli w taki sposób
            Vector listaSamochodowOsobowych = new Vector();

            To duża niedoróbka programistyczna
            Tak nie wolno robić!!!
            Gdyż aby dostać się do właściwości obiektu SamochodOsobowy, musmy wykonać rzutowanie
            czyli zrobić tak:

             */
            idPom = ((SamochodOsobowy) this.listaSamochodowOsobowych.elementAt(i)).getId();

            if (idPom == id) {
                //Bałaganiarski sposób programowania
                //TODO: do refaktoringu - utworzyć tymczasowy obiekt SamochodOsobowy i na nim operaować

                //Tak nie wolno robić!!!
                //Nie wolno zaszwać literałów w kodzie w taki sposób "W"
                ((SamochodOsobowy) this.listaSamochodowOsobowych.elementAt(i)).setStatus("W");

                //Poprawiona wersja poprzedniej instrukcji
                ((SamochodOsobowy) this.listaSamochodowOsobowych.elementAt(i)).setStatus(Pojazd.WYCOFANY);

                System.out.println("Wycofano samochód: " + ((SamochodOsobowy) this.listaSamochodowOsobowych.elementAt(i)));
            }

        }
    }
}
