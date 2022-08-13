package com.basics;

import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner scannerObject = new Scanner(System.in);
        String strInstance1 = scannerObject.next();
        String strInstance2 = scannerObject.nextLine();
        // If suppose the combined input we give in the console is "hello beautiful world", strInstance1 will be assigned "hello" which is the 'next' word which doesn't have any whitespaces. strInstance2 will be assigned " beautiful world" which is the 'next line' until a line-break. Note how the second string even has a whitespace at the front.


        int integer1 = scannerObject.nextInt();
        // Note that if we press Enter (add a '\n' character) after giving the input of this integer, the below string will have a '\n' character before it, inhibiting its conversion to Double
        String stringInstance3 = scannerObject.nextLine();
        Double double1 = Double.parseDouble(stringInstance3);

        // If we wish to press Enter key (add a '\n' character) between each input as well as use the `nextLine()` method. We will have to do the following.
        int integer2 = scannerObject.nextInt();
        // Note that if we press Enter after giving the input of this integer, the below string will have a '\n' character before it, inhibiting its conversion to Double

        scannerObject.nextLine(); // This removes the extra '\n' character that would get added to the next input BELOW.

        String stringInstance4 = scannerObject.nextLine();
        Double double2 = Double.parseDouble(stringInstance4);
    }
}
