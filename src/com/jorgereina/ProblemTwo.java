package com.jorgereina;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Jorge Reina on 12/5/15.
 */
public class ProblemTwo
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<Integer>();



        System.out.println("This program finds the largest and smallest numbers.");

        while(scanner.hasNext()){
            int temp = scanner.nextInt();


            if(temp == 0 && list.isEmpty()){
                System.out.println("No Values entered");
            }
            else if(temp == 0){
                break;
            }

            else{
                list.add(temp);
            }

        }

        Collections.sort(list);
        int maxValue = list.get(list.size()-1);
        int minValue = list.get(0);

        System.out.println("Largest Value: " + maxValue );
        System.out.println("Smalles Value: " + minValue );


    }
}
