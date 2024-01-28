package chapter2;

public class ReturnValueAssignment {
    public static void main(String[] args) {
        boolean helthy = false;
//      Below = is used for assignment operation. If we use == like this then else situation will return.
        if (helthy = true)
            System.out.println("Good!");
        else System.out.println("Bad!");
    }
}
