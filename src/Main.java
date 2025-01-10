public class Main {
    public static void main(String[] args) {


        String[] words = {"SkillBox", "UrbanUniversitet", "Yandex"};

        final int maxLength = 8;
        final String longestWord = "";

        Expression expression = n -> n.length() > maxLength;

        System.out.println(maxLine(words, expression));
    }

    public static String maxLine(String[] words, Expression exp) {
        String result = " ";
        for (String element : words) {
            if (exp.isEqual(element)) {
                result += element;
            }
        }
        return result;
    }
}

interface Expression {
    boolean isEqual(String a);
}