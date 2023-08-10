public class Pies {
//    Pola
    String imie;
    int wiek;

//  Konstruktory

    public Pies (String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public Pies(String imie) {  //alt+insert wyświetla menu do wstawiania i automatycznie tworzy np konstruktor
        this (imie,0);
    }

//    Metody- mogą np zmieniać pola

    public void minalRok() {
        this.wiek += 1;   //w konstruktorze zainicjalizowane zostały jakieś wartości, a metoda je zmienia
    }


}
