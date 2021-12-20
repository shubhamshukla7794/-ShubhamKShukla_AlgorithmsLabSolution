package com.greatlearning.main;

import com.greatlearning.service.DenominationService;

import java.util.HashMap;
import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        DenominationService service = new DenominationService();

        Scanner input = new Scanner(System.in);
        int size, amount;

        System.out.print(" Enter the size of currency denominations :  ");
        size = input.nextInt();

        int curr_deno[] = new int[size];

        System.out.println(" Enter the values of array :");
        for (int i =0; i<size; i++)
            curr_deno[i] = input.nextInt();


        System.out.print(" Enter the amount you want to pay  : ");
        amount =  input.nextInt();

        //Uncomment the below block for Solving the solution using Map
        //------------------------------------------------------------
//        HashMap<Integer, Integer> numOfNotes = service.noOfNotesUsingMap(curr_deno, amount);
//        if (numOfNotes == null) {
//            System.out.println(" Amount value is 0.");
//        } else if (numOfNotes.isEmpty()){
//            System.out.println(" Exact amount cannot be given with this denominations");
//        }
//        else {
//            System.out.println("Your payment approach in order to give min no of notes will be");
//            service.printDenomsAndNotes(numOfNotes);
//        }

        //Solution using Array
        //--------------------
        service.noOfNotesV2(curr_deno, amount);


    }

}
