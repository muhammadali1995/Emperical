package InterviewPrep.DataStucture.Queue;

public class MyAQueue {
    private int size = 0;
    private int[] values;
    private int start = 0;
    private int end = 0;

    public MyAQueue(int sz) {
        values = new int[sz];
    }

    public void enqueue(int value) {
        if (end< values.length &&  size <= values.length-1){
            values[end] = value;
            size++;
            end++;
        }
    }

    public int dequeue() {
        int val = 0;
        if (size > 0) {
            if (start == values.length-1) {
                val = values[start];
                start = 0;
            } else {
                val = values[start];
                start++;
            }
            size--;
        }
        return val;
    }

    public boolean empty(){
        return size == 0;
    }

    public boolean full(){
        return size == values.length;
    }
}
