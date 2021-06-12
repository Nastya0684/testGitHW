public class HomeWorkApp2 {
    public static void main(String[] args) {
            task1(20, 15);
            task2(125);
            System.out.println("result = " + task3(12));
            task4();

        }

        public static void task1(int a, int b) {

            String result;
            result = (a + b >= 10 && a + b <= 20) ? "true" : "false";

            System.out.println("Result =  " + result);

        }

        public static void task2(int a) {

            if (a >= 0) {
                System.out.println("Число положительное");
            } else {
                System.out.println("Число отрицательное");

            }

        }


        public static boolean task3(int a) {

            if (a < 0) {
                return true;
            } else {
                return false;
            }
        }


        public static void task4() {

            for (int i = 1; i <= 10; i++)
                System.out.println("Привет");
        }

    }



