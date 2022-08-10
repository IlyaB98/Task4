public class Main {
    public static void main(String[] args) {
        task4();
    }
    public static void task1(){

        int [] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;

        double [] two = {1.57, 7.654, 9.986};

        int [] three = new int[7];
    }

    public static void task2(){

        int [] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;

        double [] two = {1.57, 7.654, 9.986};

        int [] three = new int[7];

        for (int i = 0; i < one.length; i++) {
            if (i == one.length - 1){
                System.out.print(one[i] + " ");
            }else {
                System.out.print(one[i] + ", ");
            }
        }

        for (int i = 0; i < two.length; i++) {
            if (i == two.length - 1){
                System.out.print(two[i] + " ");
            }else {
                System.out.print(two[i] + ", ");
            }
        }

        for (int i = 0; i < three.length; i++) {
            if (i == three.length - 1){
                System.out.print(three[i] + " ");
            }else {
                System.out.print(three[i] + ", ");
            }
        }

    }

    public static void task3(){

        int [] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;

        double [] two = {1.57, 7.654, 9.986};

        int [] three = new int[7];

        for (int i = (one.length - 1); i >= 0; i--) {
            if (i == 0){
                System.out.print(one[i] + " ");
                System.out.println();
            }else {
                System.out.print(one[i] + ", ");
            }
        }
        for (int i = (two.length - 1); i >= 0; i--) {
            if (i == 0){
                System.out.print(two[i] + " ");
                System.out.println();
            }else {
                System.out.print(two[i] + ", ");
            }
        }
        for (int i = (three.length - 1); i >= 0; i--) {
            if (i == 0){
                System.out.print(three[i] + " ");
                System.out.println();
            }else {
                System.out.print(three[i] + ", ");
            }
        }
    }

    public static void task4(){

        int [] one = new int[3];
        one[0] = 1;
        one[1] = 2;
        one[2] = 3;

        for (int i = 0; i < one.length; i++) {
            if (one[i] % 2 == 0){
                System.out.println(one[i]);
            } else {
                System.out.println(one[i] + 1);
            }
        }
    }
}