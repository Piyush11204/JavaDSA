package LinkedList;

public class LL {
    // initialize 
    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }
    public Node get(int index) {
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node;
    }

    // Add to start of list 
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;  // point it to head
        head = node;   // and then make it head

        if (tail == null) {
            tail = head;
        }
        size+=1;
    }

    // Add to end of the list
    public void insertLast(int val){
        if (tail == null) {
            insertFirst(val);
            return;
        }

        Node node = new Node(val);
        tail.next = node;  // point tail to that node
        tail = node;   // and then make it tail

        
        size++;
    }
    public void insert(int val , int index){
        if(index == 0){
            insertFirst(val);
            return;
        }
        if (index==size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val, temp.next);  // temp.next will point to Next value after the inserted one...
        temp.next=node;
        size++;
    }


    //Delete first
    public int DeleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
        //Delete last
        public int DeleteLast(){
            if(size<=1){
                return DeleteFirst();
            }
            Node secondlast = get(size-2);
            
                        int val = tail.value;
                        tail = secondlast;
                        tail.next=null;
                        if(head==null){
                            tail=null;
                        }
                        size--;
                        return val;
                    }
            
                    public int Delete(int index){
                        if (index==0) {
                            return DeleteFirst(); 
                        }
                        if(index ==size-1){
                            return DeleteLast();
                        }
                        Node prev = get(index -1);
                        int val =prev.next.value;
                        prev.next = prev.next.next;
                        return val;
                    }
            
                // display the list
    public void display(){
        Node temp = head;
        while (temp !=null) {
            System.out.print(temp.value + " -> ");
            temp=temp.next;

        }
        System.out.print("END");
        System.out.println();
    }


    // here we create the Node..
    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }


    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(5);
        list.insertFirst(12);
        list.insertFirst(6);
        list.insertLast(44);
        list.insert(23, 2);

        list.display();
        System.out.println(list.DeleteFirst());
        System.out.println(list.DeleteLast());
        list.display();
        

    }

}
