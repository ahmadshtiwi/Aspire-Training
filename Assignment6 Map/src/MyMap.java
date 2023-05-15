public class MyMap<K,V> {
    private Node first;
    private int size=0;
    public MyMap()
    {
        first=null;
    }
    class Node
    {
        K key;
        V value;
        Node next;
    }

    /*
    * set key and value in same node
     */

    public  void  put(K key,V value)
    {
        Node newNode=new Node();
        newNode.key=key;
        newNode.value=value;

        if(size==0) {
            first = newNode;
            newNode.next=null;
        }
        else
        {
            newNode.next=first;
            first=newNode;
        }
        size++;
    }

    public void remove()
    {
        if(size==0)
            System.out.println("OutOfBound");
        if(size==1) {
            first = null;
            size--;
        }
        else
        {
            first=first.next;
        }
    }

    public V get (K key)
    {
        Node curr=first;
        while (curr!=null){
            if(curr.key==key)
                return curr.value;

            curr=curr.next;
        }

        return null;
    }

    public int size()
    {
        return size;
    }

}
