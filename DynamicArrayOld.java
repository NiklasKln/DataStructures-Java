class DynamicArray {
    int[] array;
    int capacity;
    int length;

    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
        this.length = 0;
    }

    public int get(int i) {
        return this.array[i];

    }

    public void set(int i, int n) {
        this.array[i] = n;
    }

    public void pushback(int n) {
        if(this.length == this.capacity) {
            resize();
        }
        this.array[this.length] = n;
        this.length++;
    }

    public int popback() {
        int x = this.array[length-1];
        this.length--;
        return x;
    }

    private void resize() {
        this.capacity = capacity * 2;
        int[] newArray = new int[this.capacity];
        for(int i = 0; i < array.length; i++) {
            newArray[i] = this.array[i];
        }
        this.array = newArray;
    }

    public int getSize() {
        return this.length;
    }

    public int getCapacity() {
        return this.capacity;
    }
}