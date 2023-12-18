package chapter1;

public class Chick {
    private String name = "Fluffy";

    public Chick() {
        name = "Tiny";
    }

    public static void main(String[] args) {
        Chick chick = new Chick();

        System.out.println(chick.name);
    }
}
