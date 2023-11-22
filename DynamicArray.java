class DynamicArray {
    int[] array;
    int capacity;


    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new int[capacity];
    }

    public int get(int i) {
        return this.array[i];
    }

    public void set(int i, int n) {
        this.array[i] = n;
    }

    public void pushback(int n) {
        //end = capacity -1
        this.array[capacity -1] = n;
    }

    public int popback() {
        int x = this.array[capacity-1];
        this.array[capacity-1] = 0;
        return x;
    }

    private void resize() {
        
    }

    public int getSize() {
        for(int i = 0; i < this.capacity; i++) {
            int elements = 0;
            if(this.array[i] != 0) {

            }
        }
    }

    public int getCapacity() {

    }
}