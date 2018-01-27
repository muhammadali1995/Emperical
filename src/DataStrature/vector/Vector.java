package DataStrature;

import java.util.Scanner;

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
        if (size == array.length) {
            Object temp[] = array;
            this.array = new Object[temp.length * 2];
            for (int i = 0; i < temp.length; i++) {
                this.array[i] = temp[i];
            }
            this.array[temp.length] = item;
            size++;
        } else {
            size++;
            array[size - 1] = item;
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
        } else if (size == index) {
            Object temp[] = array;
            this.array = new Object[temp.length * 2];
            for (int i = 0; i < temp.length; i++) {
                this.array[i] = temp[i];
            }
            this.array[index] = item;
            size++;
        } else {
            for (int i = size; i > index; i--) {
                array[i] = array[i - 1];
            }
            array[index] = item;
            size++;
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Vector vector = new Vector();
        for (int i = 0; i < n; i++) {
            vector.push(scanner.next());
        }
        vector.insert(2, 5);
        System.out.println(vector.size());
        for (int i = 0; i < vector.size(); i++) {
            System.out.println(vector.at(i));
        }

    }
}
