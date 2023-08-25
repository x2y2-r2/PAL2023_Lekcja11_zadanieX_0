import java.util.ArrayList;
import java.util.Scanner;

public class Game {
    private ArrayList<Player> playersList;

public String getUserInput(String prompt) {
    System.out.print(prompt + ": ");
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine().toUpperCase();
}
public void gameOver () {

    //    x znaków w linii poziomej
//    wyszukaj w każdym wierszu znak gracza i sprawdź n kolejnych znaków czy są takie same
//    sprawdź warunek czy nie wychodzą za plansze, index n + długość wygranej < długości wiersza

//    x znaków pionowo
//    wyszukaj znak w wierszu
//    jeżeli index wiersza + długość wygranej-1 > wielkości planszy- nie sprawdzaj tej możliwości
//    sprawdź, czy w każdym wierszu symbol gracza znajduje się w tej samej kolumnie, liczba powtórzeń równa długości wygranej

//    x znaków po przekątnej
//    jeżeli index wiersza (i kolumn) + długość wygranej-1 > wielkości planszy- nie sprawdzaj tej możliwości
//    sprawdź iterując od x,y do x+dł.wygranej,y+dł.wygranej zajęte przez ten sam symbol gracza
//    jeszcze raz ten sam warunek tylko x,y - dł. wygranej
}

    Row wierszDwa = board.getRows().get(1);
    Field pole2 = wierszDwa.fields.get(1);


    }
        wierszDwa.changeFieldSymbol(1,"X");
        board.show();

}
