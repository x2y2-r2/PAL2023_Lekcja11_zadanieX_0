import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    private Game game = new Game();
    public void main(String[] args) {

//        Napisz prostą grę w kółko krzyżyk
//
//        Wymagania:
//        1. Gra ma być na dwóch graczy
//        2. Rozmiar planszy ma być konfigurowany na starcie gry
//        3. Gracze mają mieć możliwość wprowadzenia swojego imienia
//        4. Gracz wygrywa, gdy ma 3 swoje symbole obok siebie w dowolnej konfiguracji - pion, poziom, skos
//        5. Gracze mają wprowadzać wybór swojego pola jeden po drugim
//        6. Program ma znajdować moment w którym jeden z graczy zwycięża
//        7. Gra ma mieć 3 rundy
//        8. Zaczynający turę gracz ma się zmieniać co rozgrywkę
//        9. Można zakończyć grę w dowolnym momencie po wpisaniu słowa quit
//        10. Gra ma informować jakie dane powinny być wprowadzone.

//        Możliwe rozszerzenia:
//          1. Gra na wielu graczy


        System.out.println("Ilu graczy?");
        int numberOfPlayers = Integer.valueOf(game.getUserInput("Number of players"));
        ArrayList<Player> players = new ArrayList<>(numberOfPlayers);



//          2. Możliwość grania dowolnym symbolem
//          3. Możliwość zdefiniowania ile symboli obok siebie daje zwycięstwo


//          Jak projektować klasę?
//          Jak zapisywać interakcje między klasami?
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Jak duża tablica?");
//        int size = scanner.nextInt();

        Board board = new Board();
        board.initialize(5); //        board.initialize(size);

        board.show();
        System.out.println("---------------------");







    }
}