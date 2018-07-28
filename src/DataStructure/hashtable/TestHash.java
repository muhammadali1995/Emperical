package DataStructure.hashtable;

public class TestHash {
    public static void main(String[] args) {

        Hashtable hashtable = new Hashtable(12);
        hashtable.add(1234, 12);
        assert hashtable.exists(1234) : "the value should exist";

        hashtable.add(10, 34);
        assert (int) hashtable.get(10) == 34 : "the value returned should be equal to 34";


        hashtable.add(11, 34);
        hashtable.add(23, 90);


        hashtable.remove(23);

        assert hashtable.get(23) == null : "the value returned should be equal to null";

    }
}
