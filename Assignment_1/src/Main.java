public class Main {

    public static void evenNumber()
    {
        /* Using for loop */
        int sumEvenNumber=0;
        for(int i=0;i<=100;i+=2)
        {
            sumEvenNumber+=i;
        }
        System.out.println("Sum Even Number = "+sumEvenNumber);


        /*  Using While loop */

        int j=0 ;
        sumEvenNumber=0;
        while(j<=100)
        {
            sumEvenNumber+=j;
            j+=2;
        }
        System.out.println("Sum Even Number = "+sumEvenNumber);


        /* Using do while loop */
        int c=0;
        sumEvenNumber=0;
        do{
            sumEvenNumber+=c;
            c+=2;
        }while(c<=100);
        System.out.println("Sum Even Number = "+sumEvenNumber);

    }

    public static void oddNumber()
    {
        /* Using for loop */
        int sumOddNumber=0;
        for(int i=1;i<=100;i+=2)
        {
            sumOddNumber+=i;
        }
        System.out.println("Sum Odd Number = "+sumOddNumber);


        /*  Using While loop */
        int j=1 ;
        sumOddNumber=0;
        while(j<=100)
        {
            sumOddNumber+=j;
            j+=2;
        }
        System.out.println("Sum Odd Number = "+sumOddNumber);


        /* Using do while loop */
        int c=1;
        sumOddNumber=0;
        do{
            sumOddNumber+=c;
            c+=2;
        }while(c<=100);
        System.out.println("Sum Odd Number = "+sumOddNumber);

    }

    public static void multiSeven()
    {
        /* Using for loop */
        int sumMultiplesSeven=0;
        for(int i=0;i<=100;i++)
        {
            if(i%7==0)
                sumMultiplesSeven+=i;
        }
        System.out.println("Sum Multiples Seven = "+sumMultiplesSeven);


        /*  Using While loop */

        int j=0 ;
        sumMultiplesSeven=0;
        while(j<=100)
        {
            if(j%7==0)
                sumMultiplesSeven+=j;
            j++;
        }
        System.out.println("Sum Multiples Seven Number = "+sumMultiplesSeven);


        /* Using do while loop */
        int c=0;
        sumMultiplesSeven=0;
        do{
            if(c%7==0)
                sumMultiplesSeven+=c;
            c++;
        }while(c<=100);
        System.out.println("Sum Multiples Seven Number = "+sumMultiplesSeven);

    }

    public static void main(String[] args) {

        evenNumber();
        oddNumber();
        multiSeven();

    }
}
