package chapter1;

public class Wrapper {
    public static void main(String[] args) {
        int primitive = Integer.parseInt("123"); //Converts a String to an int primitive.
        Integer wraper = Integer.valueOf("123"); //Converts a String to an Integer wrapper class.

        System.out.println(primitive);
        System.out.println(wraper);
    }
}
