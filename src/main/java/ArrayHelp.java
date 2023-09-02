public class ArrayHelp {

    public static String replace(String array) {
        return array
                .replace('[', '{')
                .replace(']', '}')
                ;
    }

    public static void main(String[] args) {
        final String srcArray = "[[1]]";
        System.out.println("");
        System.out.println(replace(srcArray));
    }
}
