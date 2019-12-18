package GeekBrainsJava1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;
import java.util.Scanner;
import java.util.SimpleTimeZone;

public class Homework4 {

    static final int SIZE = 3;
    static char[][] field = new char[SIZE][SIZE];
    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static final char EMPTY_DOT = '.';
    static final char PLAYER_DOT = 'X';
    static final char AI_DOT = 'O';

    private static void initField(){
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                field[i][j] = EMPTY_DOT;
            }
        }
    }

    private static void printField(){
            for (int i = 0; i < SIZE; i++) {
            if (i == 0) {
                System.out.print("   " + (i + 1) + " ");
            } else {
                System.out.print((i + 1) + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " |");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(field[i][j] + "|");
            }System.out.println();
        }

    }

    private static boolean isValid(int y, int x) {
        if (x < 0 || y < 0 || x > SIZE - 1 || y > SIZE - 1) {
            return false;
        }
        return field[y][x] == EMPTY_DOT;
    }

    static void playersTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координату X:");
            x = scanner.nextInt() - 1;
            System.out.println("Введите координату Y:");
            y = scanner.nextInt() - 1;
        }
        while (!isValid(y, x));
        setSymbol(y, x, PLAYER_DOT);
    }

    static void aiTurn() {
        int x;
        int y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        }
        while (!isValid(y, x));
        setSymbol(y, x, AI_DOT);
    }

    private static void setSymbol(int y, int x, char symbol) {
        field[y][x] = symbol;
    }

    static boolean isFieldsFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (field[i][j] == EMPTY_DOT) return false;
            }
        }
        return true;
    }

    static boolean checkWin(char symbol) {
        for (int i = 0; i <SIZE ; i++) {

        }
        if (field[0][0] == symbol && field[0][1] == symbol && field[0][2] == symbol)
            return true;
        if (field[1][0] == symbol && field[1][1] == symbol && field[1][2] == symbol)
            return true;
        if (field[2][0] == symbol && field[2][1] == symbol && field[2][2] == symbol)
            return true;
        if (field[0][0] == symbol && field[1][0] == symbol && field[2][0] == symbol)
            return true;
        if (field[0][1] == symbol && field[1][1] == symbol && field[2][1] == symbol)
            return true;
        if (field[0][2] == symbol && field[1][2] == symbol && field[2][2] == symbol)
            return true;
        if (field[0][0] == symbol && field[1][1] == symbol && field[2][2] == symbol)
            return true;
        if (field[2][0] == symbol && field[1][1] == symbol && field[0][2] == symbol)
            return true;
        return false;
    }

    public static void main(String[] args) {
        initField();
        printField();

        while (true) {
            playersTurn();
            printField();
            if (checkWin(PLAYER_DOT)) {
                System.out.println("Player WINS!");
                break;
            }
            if (isFieldsFull()) {
                System.out.println("DRAW!");
                break;
            }
            aiTurn();
            printField();
            if (checkWin(AI_DOT)) {
                System.out.println("AI WINS!");
                break;
            }
            if (isFieldsFull()) {
                System.out.println("DRAW!");
                break;
            }
        }
    }
}