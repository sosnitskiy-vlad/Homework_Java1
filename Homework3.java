package GeekBrainsJava1;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Homework3 {
    private static Scanner scanner = new Scanner(System.in);

    private static void guessNumber() {
        int range = 9;
        int numberGuessed = (int) (Math.random() * range);
        int counter = 3;
        System.out.println("Угадайте число от 0 до 9 ");
        while (counter > 0) {
            int inNumber = scanner.nextInt();
            if (inNumber == numberGuessed) {
                System.out.print("Вы угадали! ");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»");
                break;
            } else if (inNumber > numberGuessed) {
                counter--;
                System.out.println("Загаданное число меньше!");
                System.out.println("Осталось попыток : " + counter);
            } else {
                counter--;
                System.out.println("Загаданное число больше!");
                System.out.println("Осталось попыток : " + counter);
            }
            if (counter == 0) {
                System.out.print("Вы проиграли! ");
                System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»");
                break;
            }
        }
        if (scanner.nextInt() == 1) guessNumber();
        else System.out.println("Спасибо за игру!");
    }

    public static void main(String[] args) {
        guessNumber();
        scanner.close();
    }
}






