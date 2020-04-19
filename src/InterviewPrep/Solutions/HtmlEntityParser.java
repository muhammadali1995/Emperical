package InterviewPrep.Solutions;

public class HtmlEntityParser {
    public String entityParser(String text) {
        StringBuilder stringBuilder = new StringBuilder(text);
        for (int i = 0; i < stringBuilder.length() - 3; i++) {
            if (i + 6 <= stringBuilder.length()) {
                String substring1 = stringBuilder.substring(i, i + 6);
                System.out.println(substring1);
                if (substring1.equals("&quot;")) {
                    stringBuilder.replace(i, i + 6, "\"");
                    continue;
                } else if (substring1.equals("&apos;")) {
                    stringBuilder.replace(i, i + 6, "'");
                    continue;
                }
            }

            if (i + 5 <= stringBuilder.length()) {
                String substring2 = stringBuilder.substring(i, i + 5);
                if (substring2.equals("&amp;")) {
                    stringBuilder.replace(i, i + 5, "&");
                    continue;
                }
            }

            if (i + 7 <= stringBuilder.length()) {
                String substring4 = stringBuilder.substring(i, i + 7);
                if (substring4.equals("&frasl;")) {
                    stringBuilder.replace(i, i + 7, "/");
                    continue;
                }
            }

            String substring3 = stringBuilder.substring(i, i + 4);
            if (substring3.equals("&gt;")) {
                stringBuilder.replace(i, i + 4, ">");
                continue;
            } else if (substring3.equals("&lt;")) {
                stringBuilder.replace(i, i + 4, "<");
                continue;
            }
        }
        return stringBuilder.toString();
    }
}
