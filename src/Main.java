public class Main {
    public static void main(String[] args) {

        String[] array = {"Виктор", "Андрей", "Великослав", "Джамаллитдин", "Великобритания", "Франция","Рим"};

        Expression exp = (a, b) -> a > b ;
        System.out.println(longestWord(array, exp));


    }

    public static String longestWord(String[] array, Expression exp) {
        String result = array[0];
        for (String element : array) {
            if (exp.isEqual(element.length(), result.length())) {
                result = element;
            }
        }
        return result;
    }

}

interface Expression {
    boolean isEqual(int a, int b);
}