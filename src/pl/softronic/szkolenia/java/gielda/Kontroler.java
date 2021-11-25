package pl.softronic.szkolenia.java.gielda;

import java.time.LocalDate;


public class Kontroler {
    Gielda gielda;
    UrzadSkarbowy us;
    Pojazd pojazd;
    SamochodOsobowy so;
    Zaglowka zaglowka;

    public void uruchomProgram() {
        //Uruchamia metody: tworzącą i testujacą giełdę
        tworzGielde();
        wczytajDane();
        testujGielde();
    }

    public void tworzGielde() {
        System.out.println("Tworzę giełdę");

        //Tworzymy giełdę
        gielda = new Gielda();
        gielda.setNazwa("Giełda wspaniałych pojazdów");
        gielda.adres = "Warszawa ul. Jasna ";

        //Tworzymy Urząd Skarbowy
        us = new UrzadSkarbowy();
        us.setNazwa("Urząd Skarbowy - Warszawa Praga");
        us.adres = "Warszawa ul. Jagiellońska 15 ";


    }

    public void testujGielde(){
        System.out.println("Testuję giełdę");

        System.out.println(gielda);
        System.out.println(us);

        //Testujemy pojazd
        pojazd = new Pojazd("O","Aston Martin",1958, 300_000f, 1,1);
        System.out.println(pojazd);

        //Testujemy samochód osbowy
        so = new SamochodOsobowy("O","Aston Martin",1958, 300_000f, 1,1);
        so.setLiczbaMiejsc(5);
        so.setNadwozie("coupe");

        //TODO: "Trzeba odkomentować i poprawić ustawienie daty";
        //so.setDataPrzegladu(LocalDate.parse("23-02-2021"));
        System.out.println(so);

        //Testujemy zaglowke
        zaglowka = new Zaglowka("O","Carina",1978, 30_000f, 1,1);
        zaglowka.setLiczbaMiejsc(5);
        zaglowka.setPowZagli(14f);
        System.out.println(zaglowka);

    }

    private void wczytajDane() {

    }
}
