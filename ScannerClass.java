package com.tts;

import java.util.*;

public class ScannerClass {
    public static void askName() {
        Scanner theScanner = new Scanner(System.in);
        System.out.print("What is your name: ");
        String something = theScanner.next();

        System.out.println("Hello " + something);
        System.out.println("Would you like to continue with the interactive portion?: ");
        String yesOrNo = theScanner.next();
        String maybe;
        if(yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("y")) {
            do{
                System.out.println("What is your Pets name?: ");
                String petName = theScanner.next();
                System.out.println("What is the age of your pet?: ");
                int petAge = theScanner.nextInt();
                System.out.println("What is your lucky number?: ");
                int luckyNum = theScanner.nextInt();
                System.out.println("Jersey number of favorite sport player?: ");
                int jerseyNum = theScanner.nextInt();
                System.out.println("Two digit number of the year of the make of your car?: ");
                int carNum = theScanner.nextInt();
                System.out.println("What is the first name of your favorite actress?: ");
                String actressNum = theScanner.next();
                System.out.println("Enter random number between 1 and 50: ");
                int randNum = theScanner.nextInt();

                int randomNum1 = (int) (Math.random() * 65 + 1);
                int randomNum2 = (int) (Math.random() * 65 + 1);
                int randomNum3 = (int) (Math.random() * 65 + 1);

                int num1;
                int num2;
                int num3;
                int num4;
                int num5;
                int num6;

                //magicball
                jerseyNum = jerseyNum * randomNum1;
                do {
                    if (jerseyNum <= 75 && jerseyNum >= 1) {
                        break;
                    } else if (jerseyNum > 75) {
                        jerseyNum = jerseyNum - 75;
                    } else if (jerseyNum < 1) {
                        jerseyNum = jerseyNum + 75;
                    }
                } while (jerseyNum > 75 || jerseyNum < 1);
                num1 = jerseyNum;

                //number2
                char thething = petName.charAt(2);
                num2 = (int) thething;
                do {
                    if (num2 >= 65) {
                        num2 -= randomNum1;
                    } else if (num2 < 1) {
                        num2 += randomNum1;
                    }
                } while (num2 >= 65 || num2 < 1);

                //number3
                num3 = randNum - randomNum2;
                do {
                    if (num3 > 65) {
                        num3 -= randomNum3;
                    } else if (num3 < 1) {
                        num3 += randomNum3;
                    }
                } while (num3 > 65 || num3 < 1);

                //number 4
                char thething2 = actressNum.charAt(0);
                num4 = (int) thething2;
                do {
                    if (num4 > 65) {
                        num4 -= randomNum2;
                    } else if (num4 < 1) {
                        num4 += randomNum2;
                    }
                } while (num4 > 65 || num4 < 1);


                //number 5
                num5 = petAge + luckyNum;
                do {
                    if (num5 > 65) {
                        num5 -= randomNum2;
                    } else if (num5 < 1) {
                        num5 += randomNum2;
                    }
                } while (num5 > 65 || num5 < 1);

                //number 6
                int theindex;
                theindex = actressNum.length() - 1;
                char thething3 = actressNum.charAt(theindex);
                num6 = (int) thething3;
                do {
                    if (num6 > 65) {
                        num6 -= randomNum1;
                    } else if (num6 < 1) {
                        num6 += randomNum1;
                    }
                } while (num6 > 65 || num6 < 1);

                System.out.println("Lottery Numbers: " + num6 + " " + num2 + " " + num3 + " " + num4 + " " + num5 +
                        " Magic ball: " + num1);

                System.out.println("Would you like to generate more lottery numbers?: ");
                maybe = theScanner.next();
            }while(maybe.equalsIgnoreCase("yes") || maybe.equalsIgnoreCase("y"));
            System.out.println("Thank you for using the lottery generator!");
        }
        else {
            System.out.println("Please return later to try the interactive portion");
        }
    }
}
