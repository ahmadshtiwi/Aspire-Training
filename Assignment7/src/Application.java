public class Application {

    public static void main(String[] args) {

        MyLinkedList<Integer> ids = MyLinkedList.of(1000, 1001, 1002,1003);
        MyLinkedList<String> names = MyLinkedList.of("Mohammad", "Ahmad", "Mosa");
        MyLinkedList<Tuple<Integer, String>> nameWithIds = ids.zip(names);

        nameWithIds.forEach(System.out::println);
        System.out.println("============");


        Tuple<MyLinkedList<Integer>, MyLinkedList<String>> tupleIdAndNames = MyLinkedList.unZip(nameWithIds);

        MyLinkedList<Integer> list1=tupleIdAndNames._1;
        MyLinkedList<String> list2=tupleIdAndNames._2;


        list1.forEach(System.out::println);
        System.out.println("============");
        list2.forEach(System.out::println);


    }
}
