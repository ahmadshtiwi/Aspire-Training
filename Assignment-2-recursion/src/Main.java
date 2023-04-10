public class Main {


    public static int sumNumber(int n, int e,int t) {


        switch (t) {
            case 1 -> {                         // for odd
                int sum = n % 2 != 0 ? n : 0;

                return n >= e ? sum : sum + sumNumber(n + 1, e,1);
            }
            case 2 -> {                         // for even
                int sum = n % 2 == 0 ? n : 0;

                return n >= e ? sum : sum + sumNumber(n + 1,  e,2);
            }
            case 7 -> {                     // for multiple seven
                int sum = n % 7 == 0 ? n : 0;

                return n >= e ? sum : sum + sumNumber(n + 1, e,7);
            }

            default -> {return 0;}


        }
    }
    public static void main(String[] args) {

        /* from 0 to 100  sum odd number */
        System.out.println("sumNumber = " + sumNumber(0,100,1));

        /* from 0 to 100  sum even number */
        System.out.println("sumNumber = " + sumNumber(0,100,2));

        /* from 0 to 100  sum multiples seven */
        System.out.println("sumNumber = " + sumNumber(0,100,7));


    }

}
