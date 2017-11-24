package com.udacity.javalib;

import java.util.Random;

public class GetJokesLib {
    static Random random = new Random();
    private static final String[] mJokes = {
            "Q: You are in a room with three monkeys. One holds a banana, one holds a book, and one holds a pencil. Who is the smartest primate in the room?\n" +
                    "\n" +
                    "A: Hopefully you.",

            "Q: Why don't blind people skydive?\n" +
                    "\n" +
                    "A: It scares the crap out of their seeing-eye dogs.",

            "Q: Why do blondes smile when there's lightning?\n" +
                    "\n" +
                    "A: They think they're getting their picture taken. ",

            "A new teacher tries to make use of her psychology courses. The first day of class, she starts by saying, \"Everyone who thinks they're stupid, stand up!\"\n" +
                    "\n" +
                    "After a few seconds, Little Johnny stands up. The teacher asks, \"Do you think you're stupid, Johnny?\"\n" +
                    "\n" +
                    "\"No, ma'am, but I hate to see you standing there all by yourself.\""

    };

    public static String getAnyJoke() {
        return mJokes[random.nextInt(mJokes.length)];
    }
}
