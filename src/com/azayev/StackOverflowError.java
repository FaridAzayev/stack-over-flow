package com.azayev;

public class StackOverflowError {
    private static final int MAX_ITERATIONS = 100000;

    public static void main(String[] args) {
        ReferenceType rt = new ReferenceType();

        try {
            //if args first param is 1 call ordinary else recursive loop
            System.out.println(args[0].equals("1") ? ordinaryLoop(rt) : recursiveLoop(rt));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static ReferenceType recursiveLoop(ReferenceType rt) {
        if (rt.i < MAX_ITERATIONS) {
            rt.i++;
            recursiveLoop(rt);
        }
        return rt;
    }

    private static ReferenceType ordinaryLoop(ReferenceType rt) {
        for (; rt.i < MAX_ITERATIONS; ) {
            rt.i++;
        }
        return rt;
    }
}


