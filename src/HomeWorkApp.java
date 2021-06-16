public class HomeWorkApp {
    public static void main(String[] args) {
        // printThreeWords();
        // checkSumSign();
        // printColor();
        // compareNumbers();
        arrayTask1();
        arrayTask2(100);
        arrayTask3();
        arrayTask4();
        arrayTask5 (5, 10);
        arrayTask6();
    }

    public static void arrayTask1() {
        int[] arr = {0, 1, 1, 1, 0, 0, 1, 1, 0, 1};

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
               arr[i] = 0;
            }

            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void arrayTask2(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void arrayTask3() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void arrayTask4() {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


public static void arrayTask5(int len, int initialValue) {
    int[] arr = new int[len];
    for (int i = 0; i < arr.length; i++) {
        arr[i] = initialValue;
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}


    public static void arrayTask6() {
        int[] arr = {10, 15, 20, 0, 1, 5, 15};
       int min = arr[0];
       int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr [i] < min) {
                min = arr [i];
            }
            if (arr[i] > max) {
                max = arr [i];
            }
        }
        System.out.println("min = " + min + " max = " + max);
    }
}

















