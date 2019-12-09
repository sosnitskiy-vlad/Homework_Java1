package geekbrainsJava1;

import java.util.Arrays;

public class Homework2 {

    //   1. Задать целочисленный массив, состоящий из элементов 0 и 1.
//        Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
//        С помощью цикла и условия заменить 0 на 1, 1 на 0
    private static void invertArray(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0) {
                arr1[i] = 1;
            } else {
                arr1[i] = 0;
            }
        }
    }

    //    2. Задать пустой целочисленный массив размером 8.
//    С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21
    private static void fillArray(int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i * 3;
        }
    }

    //        3.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ]
//        пройти по нему циклом, и числа меньшие 6 умножить на 2
    private static void changeArray(int[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) {
                arr3[i] *= 2;
            }
        }
    }

    //    4.Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
//    и с помощью цикла(-ов) заполнить его диагональные элементы единицами
    private static void fillDiagonal(int[][] arr4) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j)
                    arr4[i][j] = 1;

            }
        }
    }

    // 5.** Задать одномерный массив и найти в нем минимальный и максимальный элементы
    private static int findMin(int[] arr5) {
        int min = arr5[0];
        for (int i = 0; i < arr5.length; i++) {
            if (arr5[i] < min) {
                min = arr5[i];
            }
        } return min;
    }

    private static int findMax(int[] arr6) {
        int max = arr6[0];
        for (int i = 0; i < arr6.length; i++) {
            if (max < arr6[i]) {
                max = arr6[i];
            }
        } return max;
    }


    //    6.** Написать метод, в который передается не пустой одномерный целочисленный массив,
//    метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
//    Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
//    граница показана символами ||, эти символы в массив не входят.
//    private static boolean arrSix(int[] arr6) {
//        boolean bool = false;
//        int n = arr6.length;
//        int sumArrLeft = 0;
//        int sumArrRight = 0;
//        for (int i= 0; i < n; i++) {
//            sumArrLeft += arr6[i];
//            sumArrRight -= arr6[n];
//            n--;
//            if (sumArrLeft == sumArrRight * (-1)) {
//                bool =  true;
//            }
//        }
//        System.out.println("Array Balance : " + bool);
//    }

//    7.**** Написать метод, которому на вход подается одномерный массив
//    и число n (может быть положительным, или отрицательным), при этом метод должен
//    сместить все элементы массива на n позиций.
//    Для усложнения задачи нельзя пользоваться вспомогательными массивами.
//    public static void arrParallax(int [] arr7, int n){
//        for (int i = 0; i < arr7.length ; i++) {
//            arr7[i] =
//        }

    public static void main(String[] args) {
        int[] arr1 = {0, 0, 1, 0, 1, 1, 0};
        int[] arr2 = new int[8];
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        int[][] arr4 = new int[3][3];
        int[] arr5 = {2, -3, 7, -3, 10, 8};
        int [] arr6 = {-2, 5, 112, -44, 9};
        int max = 0;
        int min = 0;

        invertArray(arr1);
        fillArray(arr2);
        changeArray(arr3);
        fillDiagonal(arr4);



        System.out.println("1. " +Arrays.toString(arr1));
        System.out.println("2. " +Arrays.toString(arr2));
        System.out.println("3. " +Arrays.toString(arr3));
        System.out.println("4. " + Arrays.deepToString(arr4));
        System.out.println("5. Min = " + findMin(arr5));
        System.out.println("   Max = " + findMax(arr6));

    }
}

