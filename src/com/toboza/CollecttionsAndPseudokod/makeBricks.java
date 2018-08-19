package com.toboza.CollecttionsAndPseudokod;

public class makeBricks {

//    public static void main(String[] args) {
//        makeBricks
//    }

    public boolean makeBricks(int small, int big, int goal) {
        if (goal == 0) return true;
        if (big > 0 && big * 5 <= goal) {
            return makeBricks(small, 0, goal - (5 * big));
        } else if (big > 0 && big * 5 > goal && goal > 5) {
            return makeBricks(small, big - (goal / 5), goal - (goal / 5) * 5);
        } else if (small >= goal) return true;
        return false;
    }
}
