package DataStructure.hashtable;


/**
 * Hashtable data structure implemented with linear probing
 */
public class Hashtable {

    private Object[] container;
    private int size;

    public Hashtable(int size) {
        container = new Object[size];
        this.size = size;
    }

    /**
     * hashes the given key and returns hash value as int
     */

    private int hash(Object key, int tableSize) {

        String keyStringValue = key.toString();
        int hashValue;

        if (isNumber(keyStringValue)) {
            hashValue = (Integer.parseInt(keyStringValue)) % size;
        } else {

            int sumOfASCIValues = 0;
            for (int i = 0; i < keyStringValue.length(); i++) {
                sumOfASCIValues += (int) keyStringValue.charAt(i);
            }
            hashValue = sumOfASCIValues % tableSize;
        }

        return hashValue;

    }


    /**
     * add the given value with given key to the hashtable
     */
    public void add(Object key, Object value) {
        int index = this.hash(key, size);
        container[index] = value;
    }


    /**
     * check if the value exists with the given key
     * returns true if the value exists otherwise false
     */

    public boolean exists(Object key) {
        int index = this.hash(key, size);
        if (container[index] == null)
            return false;
        else
            return true;
    }


    /**
     * return the value for the given key
     */
    public Object get(Object key) {

        int index = hash(key, size);
        return container[index];
    }

    /**
     * removes the value with given key from the table
     */
    public void remove(Object key) {

        int index = hash(key, size);
        container[index] = null;

    }


    /**
     * check if the given key is int or string
     */
    private boolean isNumber(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }


}
