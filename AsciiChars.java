package com.tts;

public class AsciiChars {
    public static void printNumbers()
    {
        System.out.println("\nThe valid number are: ");
        for (int i = 0; i < 10; i++) {
            System.out.println(i + "");
        }
    }

    public static void printLowerCase()
        {
            System.out.println("\nThe valid lowercase alphabets are: ");
            for (char character = 'a'; character <= 'z'; character++) {
                System.out.println(character + "");
            }
        }

    public static void printUpperCase()
        {
            for (char character = 'A'; character <= 'Z'; character++) {
                System.out.println(character + "");
            }
        }
}
