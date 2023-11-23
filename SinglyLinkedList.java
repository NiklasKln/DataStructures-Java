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
    }

    public LinkedList() {
        this.head = new Node(0);
    }

    public int get(int index) {
        Node current = head;
        for(int i = 0; i <= index; i++) {
            Node current = current.next;
            if(current.next == null) {
                return -1;
            }
        }
        return current.data;
    }

    public void insertHead(int val) {
        Node currentHead = this.head;
        this.head = new Node(val);
        head.next = currentHead;
    }

    public void insertTail(int val) {
        Node currentTail = this.tail;
        this.tail = new Node(val);
        currentTail.next = this.tail;
    }

    public boolean remove(int index) {
        Node current = head;
        //for loop stops one node before the searched one
        for(int i = 0; i < index; i++) {
            Node current = current.next;
            if(current.next == null) {
                return false;
            } 
        }
        Node prev = current;
        Node searched = current.next;
        Node behind = current.next.next;
        prev.next = behind; //so searched in the middle is deleted
        return true;
    }

    public ArrayList<Integer> getValues() {
        ArrayList<Integer> arr = new ArrayList<Integer>();
         Node current = head;
        for(int i = 0; i <= index; i++) {
            Node current = current.next;
            arr.add(current.data);
            if(current.equals(tail)) {
                break;
            }
        }
    return arr;
    }
}
