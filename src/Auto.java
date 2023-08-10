import java.security.PublicKey;

public class Auto {
    String marka;
    int poziomPaliwa;
    int iloscAut;

    public Auto() { //konstruktor bez parametrowy- wartości początkowe wpisujemy osobno,
    }
// ustawianie wartości początkowych leży w gestii konstruktora, stąd przyjmuje on parametry
    public Auto (String marka, int poziomPaliwa) {
        this.marka = marka;    //w aktualnie tworzonym obiekcie ("this"- tym który teraz tworzymy), do jego pola marka
        // wpisz to, co przyszło z pola marka
        this.poziomPaliwa = poziomPaliwa;
    }

    public Auto (String marka) {
        this.marka = marka;     //inny zapis to this(marka, 0) - powoduje wywołanie konstruktora z tej klasy i zadanie mu odpowiednich parametrów,
        // musi być na pierwszej pozycji w konstruktorze,
        this.poziomPaliwa = 0;
        iloscAut++;
    }

    void zatankuj (int iloscPaliwa) {
        System.out.println("Tankujemy!");
        this.poziomPaliwa += iloscPaliwa;
    }
}
