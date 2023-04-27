public class Operations {

    public static int minimumValue(int[] arr)
    {
        if(arr!=null) {
            int mnValue = arr[0];

            for(int number:arr)
            {
                if(mnValue>number)
                    mnValue=number;
            }

            return mnValue;
        }
        else
        {
            System.out.println("Array is  Empty");
            return 0;
        }
    }

    public static int maximumValue(int[] arr)
    {
        if(arr!=null) {
            int mxValue = arr[0];

            for(int number:arr)
            {
                if(mxValue<number)
                    mxValue=number;
            }

            return mxValue;
        }
        else
        {
            System.out.println("Array is  Empty");
            return 0;
        }
    }


    public static double averageValue(int[] arr)
    {
        if(arr!=null) {
            double sum = 0;


            for(int number:arr)
            {
                sum+=number;
            }

            return  (sum/arr.length);
        }
        else
        {
            System.out.println("Array is  Empty");
            return 0;
        }
    }



    /*
    sort array using Insertion Sort
    Worst time complexity O(n2)
    space complexity O(1)
     */
    public static void sortArray(int []arr)
    {
        int size=arr.length;

        for(int i=1;i<size;i++)
        {
            int key , j;
            key=arr[i];
            j=i-1;

                while(j>=0&& arr[j]>key)
                {
                    arr[j+1]=arr[j];
                    j--;
                }
            arr[j+1]=key;
        }

    }
}
