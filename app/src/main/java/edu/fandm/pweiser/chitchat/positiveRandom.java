package edu.fandm.pweiser.chitchat;

import java.util.Random;

public class positiveRandom {
    //Taken from Decompiled Source

    public static final String TAG = "acarcione.PositiveRandom";
    private static Random r;

    public static int nextInt(int bound) {
        if (r == null) {
            r = new Random();
        }
        if (bound - 1 < 0)
        {
            return -1;
        }
        int base = r.nextInt(bound - 1) + 1;
        return base;// & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }

    public static int nextInt(int min, int max) {
        if (r == null) {
            r = new Random();
        }
        return (r.nextInt(max - min) + min);// & ActivityChooserViewAdapter.MAX_ACTIVITY_COUNT_UNLIMITED;
    }
}

