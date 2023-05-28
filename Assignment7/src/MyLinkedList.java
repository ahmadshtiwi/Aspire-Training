import java.util.function.Consumer;

public class MyLinkedList<E> {


    private int size;

    private Node first;
    private Node last;

    private class Node {
        private Node next;
        private Node previous;
        private E data;

        public Node(Node next, Node previous, E data) {
            this.next = next;
            this.previous = previous;
            this.data = data;
        }
    }


    public static <E> MyLinkedList<E> of(E... data) {
        MyLinkedList<E> result = new MyLinkedList<>();

        for (E datum : data) {
            result.addLast(datum);
        }
        return result;
    }

    public MyLinkedList<E> add(E data) {
        return addLast(data);
    }


    public MyLinkedList<E> addLast(E elementData) {
        Node oldLast = last;
        Node newLastNode = new Node(null, oldLast, elementData);
        last = newLastNode;
        if (oldLast == null) {
            first = newLastNode;
        } else {
            oldLast.next = newLastNode;
        }
        size++;
        return this;
    }




    public void forEach(Consumer<E> consumer) {
        Node temp = first;
        for (int i = 0; i < size; i++) {
            consumer.accept(temp.data);
            temp = temp.next;
        }
    }



/*
* convert zip from recursion to while loop
* */
    public <U> MyLinkedList<Tuple<E,U>> zip(MyLinkedList<U> anotherList){
        Node eFirst = first;
        Node uFirst = (Node)anotherList.first;
        MyLinkedList<Tuple<E, U>> acc =new MyLinkedList<>();
        while(eFirst!=null &&uFirst !=null)
        {
            acc.add(new Tuple<E,U>(eFirst.data,(U)uFirst.data));
            eFirst=eFirst.next;
            uFirst=uFirst.next;
        }

        return acc;
    }



    public static <T, U> Tuple<MyLinkedList<T>, MyLinkedList<U>> unZip(MyLinkedList<Tuple<T, U>> zippedList) {
        MyLinkedList<T> tData = new MyLinkedList<>();
        MyLinkedList<U> uData = new MyLinkedList<>();

        while(zippedList.first!=null)
        {
            tData.add(zippedList.first.data.get_1());
            uData.add(zippedList.first.data.get_2());

            zippedList.first=zippedList.first.next;

        }

        return new Tuple<>(tData, uData);
    }




}