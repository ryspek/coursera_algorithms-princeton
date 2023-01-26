package dev.ryspek.part1.hello_world;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class RandomWord {

    public static void main(String[] args) {

        String champion = StdIn.readString();

        int i = 1;

        while (!StdIn.isEmpty()) {
            String rival = StdIn.readString();
            i++;
            if (StdRandom.bernoulli(1.0/ i)) {
                champion = rival;
            }
        }

        System.out.println(champion);
        return;

    }

}
