public class methods {
    public static void main(String[] args) {
        // method = a block of reusable code that is executed when called()
        int age = 21;
        System.out.println(square(3));
        System.out.println(cube(3));

        if(ageCheck(age)){
            System.out.println("You may sign up!");
        } else{
            System.out.println("You need to be +18");
        }
    }

   static double square(double number){
        return number * number;
    }
    static double cube(double number){
        return number * number * number;
    }

    static boolean ageCheck(int age){
        if(age >= 18){
            return true;
        }else{
            return false;
        }
    }
}
