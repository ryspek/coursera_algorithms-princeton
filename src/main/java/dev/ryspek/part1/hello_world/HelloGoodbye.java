package dev.ryspek.part1.hello_world;

public class HelloGoodbye {

    public static void main(String[] args) {
        if (args.length == 2) {
            String first = args[0];
            String second = args[1];
            System.out.println(String.format("Hello %s and %s.", first, second));
            System.out.println(String.format("Goodbye %s and %s.", second, first));
        }
    }

}
