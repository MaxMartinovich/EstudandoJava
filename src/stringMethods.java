public class stringMethods {
    public static void main(String[] args) {
        String name = "Maximiliano";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf("a");
        int lastIndex = name.lastIndexOf("o");

        name = name.toUpperCase();
        // name = name.toLowerCase(); -

        System.out.println(length);
        System.out.println(letter);
        System.out.println(index);
        System.out.println(lastIndex);
        System.out.println(name);
    }
}
