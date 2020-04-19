package InterviewPrep.DataStucture.Vector;

public class Vector {
    private int[] arr;
    private int capacity;
    private int size = 0;

    /**
     * assign an initial value when not given
     * */
    public Vector() {
        capacity = 16;
        arr = new int[capacity];
    }

    public Vector(int sz) {
        double result = Math.log(sz) / Math.log(2);
        double a = Math.floor(result);
        if ((int)(result) != a) {
            a+=1;
        }
        capacity = (int) Math.pow(2, a);
        this.arr = new int[capacity];
    }

    public int getCapacity() {
        return capacity;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        }
        return false;
    }

    public int at(int index) {
        if (index < 0 || index > capacity) {
            throw new IndexOutOfBoundsException();
        }
        return arr[index];
    }

    public void push(int a) {
        if (size == capacity) {
            capacity = capacity * 2;
            this.resize(capacity);
        }
        this.arr[size] = a;
        size++;
    }

    public void insert(int index, int item) {
        if (index < 0) {
            throw new IndexOutOfBoundsException();
        }

        if (size == capacity) {
            capacity = capacity * 2;
            this.resize(capacity);
        }

        if (size <= index) {
            this.arr[index] = item;
        } else {
            int val = item;
            for (int i = index; i <= size; i++) {
                int temp = arr[i];
                arr[i] = val;
                val = temp;
            }
        }
        size++;
    }

    public void prepend(int item) {
        this.insert(0, item);
    }


    private void resize(int newCapacity) {
        int[] temp = this.arr;
        int tempSize = size;
        this.capacity = newCapacity;
        this.arr = new int[newCapacity];
        for (int i = 0; i <tempSize; i++) {
            this.arr[i] = temp[i];
        }
    }

    public int pop() {
        if (size <= 0) {
            return -1;
        }
        size--;
        int poppedItem = arr[size];
        if (size == capacity / 4) {
            resize(capacity / 4);
        }
        return poppedItem;
    }

    public int delete(int index) {
        if (index == size || index > size) {
            return 0;
        }
        int deletedItem = arr[index];
        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[size - 1] = 0;
        size--;
        return deletedItem;
    }

    public void remove(int item) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == item) {
                delete(i);
            }
        }
    }

    public int find(int item) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == item) {
                return item;
            }
        }
        return -1;
    }



}
