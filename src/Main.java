// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//         1. Konstruktory

        Auto stilo = new Auto();  //konstruktory wywołujemy tylko przez operator "new", w tym wypadku jest to konstruktor Auto(), który nie przyjmuje żadnego parametru, ma identyczną nazwę jak klasa
        stilo.marka = "Fiat";
        stilo.poziomPaliwa = 100;

//        Chcielibyśmy żeby te rzeczy nadawać przy tworzeniu obiektu

        Auto tt = new Auto("Audi", 100); // nadanie wartości przez konstruktor, wartości jako parametry konstruktora, które są inicjalizowane w konstruktorze
        System.out.println(tt.marka);
        System.out.println(tt.poziomPaliwa);
//        Stwórz klasę Pies z polami imie i wiek, zainicjalizuj je przez konstruktor

        Pies burek = new  Pies("Burek", 1);
        System.out.println(burek.imie);
        System.out.println(burek.wiek);

//        2. Konstruktory do części parametrów
//        Nasze auto ma się inicjalizować tylko z nadaną marką i poziomem paliwa równym 0
        Auto auto = new Auto("reno");
        System.out.println(auto.marka);
        System.out.println(auto.poziomPaliwa);

//        Stwórz konstruktor w klasie Pies, który ma przyjmować imię i ustawiać wiek na 0
        Pies reksio = new  Pies("Reksio");  //overload przeciążanie metod- jva sama wybiera który konstruktor ma wybrać, jeżeli podamy tylko jeden parametr to sama wybierze konstruktor jednoparametrowy
        System.out.println(reksio.imie);
        System.out.println(reksio.wiek);

//        3. Zmienianie pól za pomocą metod - klasy składają się z pól, konstruktorów i metod. Metody mogą modyfikować pola.
//        Nasze auto ma mieć metodę tankuj(iloscPaliwa), która będzie powiększać poziomPaliwa

        System.out.println("Poziom paliwa przed tankowaniem");
        System.out.println(auto.poziomPaliwa);
        auto.zatankuj(20);
        System.out.println(auto.marka + " - poziom paliwa po tankowaniu = " + auto.poziomPaliwa);
//        Stwórz metodę minalRok(), która będzie zwiększać wiek psa i 1

        reksio.minalRok();
        System.out.println("wiek Reksia: " + reksio.wiek);
    }
}