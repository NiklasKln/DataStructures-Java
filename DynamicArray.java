public Class DynamicArray<T> {
	T[] array;
	int capacity;
	int size;

	public DynamicArray(int capacity) {
		this.capacity = capacity;
		this.array = (T[]) new Object[capacity]; 
		this.size = 0;		
	}

	public void add(T value) {
		if(capacity == size) {
			resize();
		}
		this.array[size] = value;
		this.size++;
	}

	public boolean remove(T value) {
		int index = contains(value);
		if(index == -1) {
			return false;
		}
		while(index < this.size - 1) {
			this.array[index] = this.array[index + 1];
			index++;
		}
		this.size--;
		return true;
	}

	public int contains(T value) {
		for(int i = 0; i < this.size; i++) {
			if(this.array[i] == value) {
				return i;
			} 
		}
		return -1; 
	}

	public T get(int index) {
		if(index < 0 && index > size - 1) {
			throw new IndexOutOfBoundsException("Index out of bounds in get() method");
		} 
		return this.array[index];
	}
	

	public void set(int index, T value) {
		if(index < 0 && index > size - 1) {
			throw new IndexOutOfBoundsException("Index out of bounds in set() method");
		} 
		this.array[index] = value;
	}

	public boolean isEmpty() {
		return this.size == 0;
	}

	public void resize() {
		this.capacity = capacity * 2;
		T[] newArr = (T[]) new Object[capacity];
		int i = 0;
		while(i < size) {
			newArr[i] = this.array[i];
			i++;
		}
		this.array = newArr;
	}
}