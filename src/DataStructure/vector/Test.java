package DataStructure.vector;

/**
 * The class includes tests for all the methods of the Vector class;
 */
public class Test {
    public static void main(String[] args) {

        /**
         * Testing size();
         *
         * */
        Vector vector = new Vector();
        vector.push(1);
        vector.push(2);
        assert vector.size() == 2 : " the vector size must be 2";
        vector.push(4);
        assert vector.size() == 3 : "The vector size must be 3";

        /**
         * Testing capacity();
         * */
        assert vector.capacity() == 16 : "The vector capacity should be 16";

        Vector vector1 = new Vector(33);
        Vector vector2 = new Vector(78);

        assert vector1.capacity() == 64 : "The vector1 capacity should be 64";
        assert vector2.capacity() == 128 : "The vector2 capacity should be 128 ";

        /**
         * Testing isEmpty();
         * */

        Vector vector3 = new Vector();
        assert vector3.isEmpty() : "The vector should be empty";

        vector3.push(34);
        assert !vector3.isEmpty() : "The vector 3 should not be empty";

        /**
         * Testing at();
         * */
        assert (int) vector3.at(0) == 34 : "The item at index 0 should be equal to 34";

        vector3.push(3);
        vector3.push(5);
        assert (int) vector3.at(2) == 5 : "The item at index 2 should be equal to 5";
        boolean isExceptionThrown = false;
        try {
            vector3.at(4);
        } catch (IndexOutOfBoundsException e) {
            isExceptionThrown = true;
        }
        assert isExceptionThrown : "IndexOutOfBoundException should be thrown";

        /**
         * Testing push();
         * */

        assert (int) vector3.at(2) == 5 : "The last item pushed should be 5";
        vector3.push(10);
        vector3.push(98);
        assert (int) vector3.at(4) == 98 : "The last item pushed at index 4 should 98";

        /**
         * Testing insert()
         * */
        vector3.insert(5, 10);
        assert (int) vector3.at(5) == 10 && vector3.size() == 6 : "The size of the vector should be 6 and the item at index 5 should be 10";

        vector3.insert(0, 12);
        assert (int) vector3.at(0) == 12 && vector3.size() == 7 : "The size of the vector should be 7 and the item at index 0 should be 12";


        /**
         * Testing prepend();
         * */
        vector3.prepend(99);
        assert (int) vector3.at(0) == 99 && vector3.size() == 8 : "The first item in the vector should be 99 and the size should be 8";
        vector3.prepend(101);
        assert (int) vector3.at(0) == 101 && vector3.size() == 9 : "The first item in the vector should be 101 and the size should be 9";


        /**
         *
         * Testing pop();
         * */
        assert (int) vector3.pop() == 10 && vector3.size() == 8 : "The popped value should be 101 and the size also should be 8";
        assert (int) vector3.pop() == 98 && vector3.size() == 7 : "The popped value should be 98 and the size also should be 7";


        /**
         * Testing delete()
         * */
        Vector vector4 = new Vector();
        vector4.push(5);
        vector4.push(7);
        vector4.push(90);
        vector4.push(12);
        vector4.delete(0);
        assert (int) vector4.at(0) == 7 && vector4.size() == 3 : "The item at index 0 should be 7";
        vector4.delete(2);
        assert (int) vector4.at(1) == 90 && vector4.size() == 2 : "The item at index 1 should be 90";

        /** Testing remove()
         * */
        vector4.push(19);
        vector4.push(23);

        vector4.remove(19);
        assert (int) vector4.at(2) == 23 && vector4.size() == 3 : "The item at index 2 should be 23 and the size should be 3";

        /**
         *
         * Testing find();
         * */
        Vector vector5 = new Vector();
        vector5.push(1);
        vector5.push(2);
        vector5.push(4);
        vector5.push(156);
        vector5.push(12);
        vector5.push(12);

        assert vector5.find(156) == 3 : "The index should be 3";
        assert vector5.find(12) == 4 : "The index should be 4";

    }
}
