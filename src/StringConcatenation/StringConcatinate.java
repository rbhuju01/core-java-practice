package StringConcatenation;

import java.util.Scanner;

/**
 * WAP to concatenate  a string N number of times. The value of N can be 0 < N < 50000. Where the final string generated which contain every character odd number of times. Example.
 *
 * If N = 3
 * Result => dog
 *
 * If N = 4
 * Result => July
 *
 */


public class StringConcatinate {

    public static void main(String[] args) {
        {
            System.out.print("Please enter a number to concatenate the string to that number of times between 0 to 50:");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            RangeCheck rangeCheck = new RangeCheck();
            rangeCheck.checkingRange(n);
            do{
                System.out.print("Please enter a number to concatenate the string to that number of times between 0 to 50:");
                sc = new Scanner(System.in);
                n = sc.nextInt();
                rangeCheck.checkingRange(n);

            }while(rangeCheck.flag == false);

            if(rangeCheck.flag == true){
                if (n % 2 == 0 && n > 0) {
                    System.out.println("a".repeat(n - 1) + "b");
                } else {
                    System.out.println("a".repeat(n));
                }
            }
        }
    }
}
