package com.greatlearning.main;

import com.greatlearning.service.TransactionService;
import com.greatlearning.sort.MergeSort;

import java.util.Scanner;

public class Driver {

    public static void main(String[] args) {

        TransactionService service = new TransactionService();

//        Uncomment the below line to perform MergeSort so that the targets can be searched in sorted array Transaction
//        -------------------------------------------------------------------------------------------------------------
//        MergeSort mergeSort = new MergeSort();
        Scanner input = new Scanner(System.in);

        int trans_size, target_size;

        System.out.print(" Enter the size of transaction array :  ");
        trans_size = input.nextInt();

        int transactions[] = new int[trans_size];

        System.out.println(" Enter the values of array :");
        for (int i =0; i<trans_size; i++)
            transactions[i] = input.nextInt();

//        Uncomment the below line to perform MergeSort so that the targets can be searched in sorted array Transaction
//        -------------------------------------------------------------------------------------------------------------
//        mergeSort.sort(transactions, 0, transactions.length-1);

        System.out.print(" Enter the total no of targets that needs to be achieved :  ");
        target_size = input.nextInt();

        int targets[] = new int[target_size];

        for (int i =0; i<target_size; i++) {
            System.out.print(" Enter the value of target :  ");
            targets[i] = input.nextInt();
            int pos = service.targetCheck(transactions, targets[i]);
            if (pos != -1) {
                System.out.printf(" Target achieved after %d transactions\n", pos);
            }
            else {
                System.out.println(" Given target is not achieved");
            }
        }

    }
}
