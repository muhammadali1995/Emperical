package DataStrature.vector;

public class Vector {
    /**
     * The array is the initial container whose capacity will be constantly updated
     */
    private Object array[];

    /**
     * The size property holds how many items the current Vector has
     */
    private int size = 0;

    /**
     * The Vector() constructor initializes the initial array
     */
    public Vector() {
        array = new Object[16];
    }

    /**
     * The Vector () constructor gets an initial capacity
     * if it is not power of 2 then will be raised to power of 2
     */
    public Vector(int capacity) {
        double power = 16;
        int i = 4;
        while (capacity > power) {
            i++;
            power = Math.pow(2, i);
        }
        capacity = (int) power;
        array = new Object[capacity];
    }

    /**
     * The size() methods returns the number of items in the vector
     */
    public int size() {
        return this.size;
    }

    /**
     * The capacity() methods returns the number of items the current array can hold
     */
    public int capacity() {
        return this.array.length;
    }

    /**
     * The isEmpty methods return true if the current vector does not have any items, otherwise false
     */
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }

    }

    /**
     * The at() method return the item at the passed index in the vector,
     * in case there is no item at the given index it throws IndexOutOfBoundException
     */
    public Object at(int index) {
        if (size < index) {
            throw new IndexOutOfBoundsException();
        } else {
            return array[index];
        }

    }

    /**
     * The push method add the given item to the array if the size of the array equals
     * to capacity of the array, then the capacity of the array will be doubled
     */
    public void push(Object item) {
        this.resize();
        size++;
        array[size - 1] = item;
    }

    /**
     * The resize() method set a new capacity once the array capacity is full
     */
    private void resize() {
        if (size == array.length) {
            Object temp[] = array;
            this.array = new Object[temp.length * 2];
            for (int i = 0; i < temp.length; i++) {
                this.array[i] = temp[i];
            }
        } else if (size == (array.length / 4)) {
            Object temp[] = this.array;
            this.array = new Object[this.array.length / 2];
            for (int i = 0; i < size; i++) {
                this.array[i] = temp[i];
            }
        }
    }

    /**
     * The insert() method takes two arguments the index where the given item
     * will be inserted and the item
     * if the given index is bigger than the size, the method throws an IndexOutOfBoundException()
     */
    public void insert(int index, Object item) {
        if (size < index) {
            throw new IndexOutOfBoundsException();
        } else {
            this.resize();
            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = item;
            size++;
        }
    }

    /**
     * The prepend() method accepts an argument and add it to the beginning of the vector
     */
    public void prepend(Object item) {
        this.resize();
        insert(0, item);
    }

    /**
     * The pop() methods remove an item from the vector
     */
    public Object pop() {
        Object value = this.array[size - 1];
        this.array[size - 1] = null;
        size--;
        this.resize();
        return value;
    }

    /**
     * The delete() methods gets an index as an argument and
     * delete item at index, shifting all trailing elements left
     */
    public void delete(int index) {
        for (int i = index; i < size; i++) {
            array[i] = array[i + 1];
        }
        this.array[size - 1] = null;
        size--;
    }

    /**
     * The remove() method gets an item as an argument and
     * looks for value and removes index holding it (even if
     * in multiple places)
     */
    public void remove(Object item) {
        for (int i = 0; i < size; i++) {
            if (array[i] == item) {
                this.delete(i);
                break;
            }
        }
    }

    /**
     * The find() method gets an item as an argument and
     * looks for value and returns first index
     * with that value, -1 if not found
     */
    public int find(Object item) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

}
