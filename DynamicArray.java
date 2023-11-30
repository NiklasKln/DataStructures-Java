public Class DynamicArray<T> {
	T[] array;
	int capacity;
	int size;

	public DynamicArray<T>(int capacity) {
		this.capacity = capacity;
		this.array = new T[capacity]; 
		this.size = 0;		
	}

	public void add(T value) {
		
	}

	public void remove(T value) {

	}

	public T get(int index) {

	}

	public void set(int index, T value) {

	}

	public boolean isEmpty() {
		return this.size == 0;
	}

}