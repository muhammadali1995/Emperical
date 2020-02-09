package Solutions.recursion;

public class ReverseString {
    public void reverse(char [] txt) {
        int middleIndex = txt.length/2;
        if (txt.length % 2 != 0) {
            middleIndex++;
        }
        helper(middleIndex, txt);
    }

    public char[] helper(int index, char[] word) {
        if (index >= word.length) {
            return word;
        }
        helper(index + 1, word);
        char temp = word[index];
        word[index] = word[word.length - (index+1)];
        word[word.length - (index+1)] = temp;
        return word;
    }


}
