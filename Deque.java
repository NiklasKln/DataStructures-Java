Class Deque<Node> {

	Node<T> head;
	Node<T> tail;
	

	Class Node<T> {
		T data;
		Node<T> next;
		Node<T> prev;

		Node<T>(T value) {
			this.data = value;
		}
		Node<T>(T data, Node<T> prev, Node<T> next) {
			this(data, prev, next);
		}
	}

	public void addFirst(T value) {
		if(isEmpty) {
		this.head = new Node<T>(value) = this.tail;
		}
		Node<T> oldHead = this.head;
		this.head = new Node<T>(value, null, oldHead);
		oldHead.prev = this.head;
		}

	public void addLast(T value) {
		if(isEmpty) {
		this.head = new Node<T>(value) = this.tail;
		}
		Node<T> oldTail = this.tail;
		this.tail = new Node<T>(value, oldtail, null);
		oldHead.next = this.head;
		}

	}

	public void deleteFirst() {

	}

	public void deleteLast() {

	}
	

	public boolean isEmpty() {
		return this.head == null;
	}

}