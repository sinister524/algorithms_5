package ru.geekbrains.algorithms5;

public class Recursion {
    public static int involution (int number, int invo) {
        if (invo == 0)
            return 1;
        if (invo == 1)
            return number;
        else
            return number * (involution(number, invo-1));
    }

}
