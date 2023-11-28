class LinkedList {

    Node head;
    Node tail;

    class Node {
        int data;
        Node next; 

        Node(int data) {
            this.data = data;
            this.next = null;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    public LinkedList() {
        this.head = new Node(-1);
        this.tail = this.head;

    }

    public int get(int index) {
        Node current = head.next;
        int counter = 0;
        while( current != null) {
            if(counter == index) {
                return current.data;
            }
        counter++;
        current = current.next;
        }
        return -1;
    }

    public void insertHead(int val) {
        Node newNode = new Node(val);
        newNode.next = this.head.next;
        this.head.next = newNode;
        if(newNode.next == null) {
            this.tail = newNode;
        }
    }

    public void insertTail(int val) {
        Node currentTail = this.tail;
        this.tail = new Node(val);
        currentTail.next = this.tail;
    }

   
    // Method to remove at given index
    public boolean remove(int index) {
      //Schritt 1. iteriere eins davor
      int counter = 0;
      Node current = this.head;
      while(counter < index && current != null) {
        counter++;
        current = current.next;
      }
      if(current != null && current.next != null) {
        if(current.next == this.tail) {
            this.tail = current;
        }
        current.next = current.next.next;
        return true;
      }
      return false;
    }

     

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> arr = new ArrayList();
        Node current = this.head.next;
        while(current != null) {
            arr.add(current.data);
            current = current.next;
        }
        return arr;
    }
}