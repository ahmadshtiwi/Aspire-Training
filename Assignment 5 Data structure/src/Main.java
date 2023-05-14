import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Main {

    public static void main(String[] args) {

        String parentheses="()()";
        System.out.println("isValid(parentheses) = " + isValid(parentheses));

        int []arr={4,1,3,5};
        System.out.println("average(arr) = " + average(arr));

    }

    /*
     * using stack by deque
     * balanced parentheses
     * */
    public static boolean isValid(String data)
    {
        Deque<Character> deque=new LinkedList<>();

        for(char c : data.toCharArray()) // using foreach  and convert string to char of array
        {
            if(c=='(')
                deque.push(c);
            else if(deque.isEmpty())
                return false;
            else
                deque.pop();
        }

        return deque.isEmpty();
    }

    public static double average(int ... arr)
    {
        PriorityQueue<Integer> higher=new PriorityQueue<>(Integer::compareTo);
        PriorityQueue<Integer> lower=new PriorityQueue<>(Comparator.<Integer>comparingInt(a->a).reversed());

        for(int a:arr)
        {
            higher.add(a);
            if(higher.size()-lower.size()>1)
                lower.add(higher.poll());
        }

        int sumLastItem=higher.peek() + lower.peek();

        return isEven(higher.size(),lower.size()) ? (double) sumLastItem / 2: higher.peek();

    }

    /*
     * to check sum size higher and lower is even
     * */
    public static boolean isEven(int a , int b)
    {
        return (a+b)%2==0;
    }
}
