import java.util.Arrays;

public class Main {


     public static void  printArray(int []arr)
    {
        System.out.print( "[ ");
        for (int number:arr) {
            System.out.print(number + "\t");
        }
        System.out.println("]");
    }


    public static void main(String[] args) {

        int[] arr = {10,15,10,2,3,5,0,4};

        System.out.println("Minimum Value = " + Operations.minimumValue(arr));
        System.out.println("Maximum Value = " + Operations.maximumValue(arr));
        System.out.println("Average Value = " + Operations.averageValue(arr));

        Operations.sortArray(arr); // implement insertion sort
        printArray(arr);


        int[] arr2={1,3,2,0};
        Arrays.sort(arr2);   // using sort from Arrays
        printArray(arr2);



    }
}
