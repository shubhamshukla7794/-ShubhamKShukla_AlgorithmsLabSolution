package com.greatlearning.service;

import com.greatlearning.sort.MergeSort;

public class TransactionService {



    public int targetCheck(int[] transactions, int target){

        int sum = 0, flag = 0, i;
        for (i = 0; i < transactions.length; i++) {
            sum+= transactions[i];
            if (sum >= target) {
                flag = 1;
                break;
            }
        }

        if (flag == 1) {
            return i + 1;
        }else {
            return -1;
        }

    }
}
