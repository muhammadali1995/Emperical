package ToptalPrep;

public class DefangingIPAddress {
    public String defangIPaddr(String address) {
        StringBuilder builder = new StringBuilder();
        for (char s : address.toCharArray()) {
            if (s == '.') {
                builder.append("[.]");
            } else {
                builder.append(s);
            }
        }
        return builder.toString();
    }
}
