package InterviewPrep.DataStucture.Vector;

public class TestArray {
    public static void main(String[] args) {
        Vector vector = new Vector(4);
        assert vector.getCapacity() == 4 : "incorrect capacity";
        vector.push(3);
        vector.push(4);
        assert vector.getSize() == 2 : "incorrect size";
        assert !vector.isEmpty() : "it should not be empty";
        vector.push(7);
        assert vector.at(2) == 7 : "incorrect value";
        vector.insert(0, 0);
        assert vector.at(0) == 0 : "insert is working incorrectly";
        vector.prepend(3);
        assert vector.at(0) == 3 : "prepend is working incorrectly, the value at 0 should be 3";
        vector.pop();
        vector.pop();
        vector.pop();
        vector.pop();
        assert vector.getCapacity() == 2: "pop is working incorrectly";
    }
}
