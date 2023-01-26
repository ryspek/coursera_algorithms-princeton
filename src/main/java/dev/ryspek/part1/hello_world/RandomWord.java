package dev.ryspek.part1.hello_world;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {

    public static void main(String[] args) {
        String champion = "";
        for (int i = 1; !StdIn.isEmpty(); i++) {
            String rival = StdIn.readString();
            if (StdRandom.bernoulli(1.0/ i)) {
                champion = rival;
            }
        }
        StdOut.println(champion);
    }

}
