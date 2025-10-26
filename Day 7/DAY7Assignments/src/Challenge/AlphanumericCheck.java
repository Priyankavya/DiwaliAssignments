package Challenge;

public class AlphanumericCheck {
    public static boolean isAlphanumeric(String input) {
        return input != null && input.matches("[a-zA-Z0-9]+");
    }

    public static void main(String[] args) {
        String test1 = "Hello123";
        String test2 = "Hello@123";

        System.out.println(test1 + " is alphanumeric? " + isAlphanumeric(test1));
        System.out.println(test2 + " is alphanumeric? " + isAlphanumeric(test2));
    }
}
