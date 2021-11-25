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


        //Samochody do testu
        SamochodOsobowy so1 = new SamochodOsobowy("O","Polonez",1958, 300_000f, 1,1);
        SamochodOsobowy so2 = new SamochodOsobowy("O","Ford",1958, 300_000f, 1,1);
        SamochodOsobowy so3 = new SamochodOsobowy("O","Dacia",1958, 300_000f, 1,1);


        //TODO: "Trzeba odkomentować i poprawić ustawienie daty";
        //so.setDataPrzegladu(LocalDate.parse("23-02-2021"));
        System.out.println(so);

        //Testujemy zaglowke
        zaglowka = new Zaglowka("Z","Carina",1978, 30_000f, 1,1);
        zaglowka.setLiczbaMiejsc(5);
        zaglowka.setPowZagli(14f);
        System.out.println(zaglowka);

        //Testowanie przyjmownia pojazdu na giełdę.
        /*

        1. Utworzyć pojazd
        2. Gielda
        3. idSprzedawcy
        4. idWlasciciela
        5. Zaglowke lub SamochodOsobowy

        6.metodę, która nam zarejestruje fakt przyjęcia
        sygantura metody:

        nazwaMetody(SamochodOsobowy lub Zaglowka, idKlienta, idWlasciciela)

        dwie metody:
            przyjmijSamochodOsobowy(idSprzedawcy, idWlasciciela, SamochodOsobowy)
            przyjmijZaglowke(idSprzedawcy, idWlasciciela, Zaglowka)

            Gdzie (w jakim obiekcie)?

            Giełda

        */

        //Dla celów testowych udajemy że mamy właściciela i sprzedawcę
        int idSprzedawcy = 2;
        int idWlasciciela = 10;

        gielda.przyjmijSamochodOsobowy(idSprzedawcy, idWlasciciela, so);
        gielda.przyjmijSamochodOsobowy(idSprzedawcy, idWlasciciela, so1);
        gielda.przyjmijSamochodOsobowy(idSprzedawcy, idWlasciciela, so2);
        gielda.przyjmijSamochodOsobowy(idSprzedawcy, idWlasciciela, so3);

        gielda.wycofajSamochod(3);

        //Jakie samochody są na giełdzie
        gielda.wyswietlSamochodyOsobowe();
    }

    private void wczytajDane() {

    }
}
