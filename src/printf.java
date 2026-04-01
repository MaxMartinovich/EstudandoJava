public class printf {
    public static void main(String[] args) {
        // printf() = is a method used to format output

        String name = "Max";
        char firstLetter = 'M';
        int age = 26;
        double height = 1.73;
        boolean isEmployed = false;

        System.out.printf("Hello %s\n", name);

        System.out.printf("Your name starts with a %c\n", firstLetter);

        System.out.printf("Your are %d years old\n", age);

        System.out.printf("Your are %f cm tall\n", height);

        System.out.printf("Employed: %b\n", isEmployed);

        System.out.printf("%s is %d years old", name , age);


    }
}
