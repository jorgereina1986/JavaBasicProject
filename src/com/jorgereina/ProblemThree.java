package com.jorgereina;
import java.util.Scanner;

/**
 * Created by Jorge Reina on 12/5/15.
 */
public class ProblemThree
{
    public static void main(String[] args)
    {
        Scanner scanner  = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n);

        while(n!=1)
        {
            if( n == 1){
                System.out.println(n);
            }

            else if(n % 2 == 0)
            {
                n = n / 2;
                System.out.println(n);


            }
            else
            {
                n = n * 3 + 1;
                System.out.println(n);
            }

        }

    }
}

