package LinkedList;

public class DLL {
     private Node head;
     
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertLast(int val){
        Node node = new Node(val);
        Node last = head;
        while (last != null && last.next != null) {
           last= last.next ;
        }
        last.next = node;
        node.prev = last;
        last = node;
    }

    public void insert(int after , int val){
        
        Node p = find(after);
        if (p == null) {
            System.out.println("dosnt exist");
        }
        Node node = new Node(val);
        node.next = p.next;
        p.next = node;
        node.prev=p;
        if (node.next != null) {
            node.next.prev = node;
        }
    }

    public Node find(int value){
        Node node = head;
        while (node !=null) {
            if (node.val == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void display(){
        Node node = head;
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("END");
    }

    public void displayRev(){
        Node node = head;
        while (node != null && node.next != null) {
            node = node.next;
        }

        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.prev;
        }
        System.out.println( "Start");
    }

    private class Node{
         int val;
         Node next;
         Node prev;

         public Node(int val) {
            
            this.val = val;
         }
         public Node(int val , Node next , Node prev){
            this.val = val;
            this.next = next;
            this.prev = prev;
         }
    }
    public static void main(String[] args) {
            DLL list = new DLL();
        list.insertFirst(5);
        list.insertFirst(6);
        list.insertFirst(12);
        list.insertFirst(8);
        list.insertLast(11);
        list.insert(12, 69);
        list.display();
        list.displayRev();
        }
}
