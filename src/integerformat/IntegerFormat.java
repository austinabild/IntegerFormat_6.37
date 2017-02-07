/*
 * Name: 
 * Project:
 * Description: 
 * 
 * Date Started: 
 * Date Modified:
 * 
 */
package integerformat;

import java.util.Scanner;

public class IntegerFormat
{

    public static void main(String[] args)
    {
        System.out.print("Enter an interger: ");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.print("Enter the width: ");
        int width = input.nextInt();
        System.out.println(format(number, width));

       }

       public static String format(int number, int width) {
        int numberOfDigit = getSize(number);
        String format = String.valueOf(number);

        for (int i = 0; i < width - numberOfDigit; i++) {
         format = "0" + format;
        }

        return format;
       }

       /** Return the number of digits in d */
       public static int getSize(long d) {

        int numberOfDigit = 1;
        while ((d = d / 10) != 0) {
         numberOfDigit++;
        }
        return numberOfDigit;
    }
    
}
