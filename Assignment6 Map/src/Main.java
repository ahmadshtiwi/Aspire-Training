public class Main {

    public static void main(String[] args) {


        MyMap<Integer,Integer> myHashMap=new MyMap<>();

        myHashMap.put(1,1);

        myHashMap.put(10,11);


        System.out.println("myHashMap.get(1) = " + myHashMap.get(10));
    }
}