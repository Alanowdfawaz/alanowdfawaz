/**
 * Created by xenon on 2/25/2021.
 */
public class SinglyLinkedList<E> {
   private Node<E>head=null;
   private Node<E>tail=null;
   private int size=0;

    public boolean isEmpty(){
        return size==0;
    }
    public int size(){
        return size;
    }
    public E first (){
        if(isEmpty())return null;
        return head.getElement();
    }
    public E last (){
        if(isEmpty())return null;
        return head.getElement();
    }
    public void addfirst(E element){
        head=new Node<E>(element,head);
        if(size==0)
            tail=head;
        size++;
    }
    public void addlast(E element){
        Node<E>newes=new Node<E>(element,null);
        if(size==0)
            head=newes;
        else
            tail.setNext(newes);
        tail=newes;
        size++;
    }
    public E removefirst(){
        if (isEmpty()) return null;
        E deleted =head.getElement();
        head=head.getNext();
        size--;
        if(size==0)
            tail=null;
        return deleted;
    }
    /*public String print(){
        Node<E>i=head;
        String all  ="";
        while (i!=null)
            all=all+i.getElement().
    }*/

    private static class Node<E>{
        private E element;
        private Node<E>next;

        public Node(E element, Node<E> next) {
            this.element = element;
            this.next = next;
        }

        public E getElement() {
            return element;
        }

        public void setElement(E element) {
            this.element = element;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setNext(Node<E> next) {
            this.next = next;
        }
    }

    public static void main(String[] args) {
        SinglyLinkedList<String> list = new SinglyLinkedList<>();
        list.addfirst("Ebtehal");
        list.addfirst("Al anood");
        list.addlast("marwa");
        int n = list.size();
        for (int i = 0; i < n; i++) {
            String x = list.removefirst();
            System.out.println(x);
        }
        System.out.println(list.size()
        );
    }}
