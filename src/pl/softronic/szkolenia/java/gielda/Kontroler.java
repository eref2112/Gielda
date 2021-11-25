package pl.softronic.szkolenia.java.gielda;

public class Kontroler {
    Gielda gielda;

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

    }

    public void testujGielde(){

        System.out.println("Testuję giełdę");
    }

    private void wczytajDane() {

    }
}
