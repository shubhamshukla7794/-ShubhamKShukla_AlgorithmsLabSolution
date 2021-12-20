package com.greatlearning.service;

import com.greatlearning.sort.BubbleSort;
import com.greatlearning.sort.QuickSort;

import java.util.HashMap;
import java.util.Map;

public class DenominationService {

    BubbleSort bSort;
    QuickSort qSort;

    public DenominationService() {
        this.bSort = new BubbleSort();
        this.qSort = new QuickSort();
    }

    public HashMap<Integer, Integer> noOfNotesUsingMap(int[] curr_deno, int amount) {

        if (amount == 0) {
            return null;
        }

        HashMap<Integer, Integer> denomCount = new HashMap<Integer, Integer>();
        //Uncomment this to sort in descending order using Bubble Sort
        //------------------------------------------------------------
//        bSort.bubbleSort(curr_deno);
        qSort.quickSort(curr_deno,0, curr_deno.length-1);

        int temp = amount;
        for (int cDenom :curr_deno ) {
            if (cDenom > 0) { //to avoid divide by 0
                int notes = temp /cDenom;
                if (notes >= 1) {
                    denomCount.put(cDenom, notes);
                    temp = temp - (cDenom * notes);
                }
            }
        }

        if (temp > 0) {
            denomCount.clear();
        }

        return denomCount;

    }

    public void printDenomsAndNotes(HashMap<Integer, Integer> denomsAndNotes) {
        for (Map.Entry m : denomsAndNotes.entrySet()) {
            System.out.println(m.getKey() + " : " + m.getValue());
        }
    }

    public void noOfNotesV2(int[] curr_deno, int amount) {

        if (amount == 0) {
            System.out.println(" Amount is 0.");
        }

        int[] denomCount = new int[curr_deno.length];

        //Uncomment this to sort in descending order using Bubble Sort
        //------------------------------------------------------------
//        bSort.bubbleSort(curr_deno);

        qSort.quickSort(curr_deno,0, curr_deno.length-1);

        int temp = amount;

        for (int i=0; i<curr_deno.length; i++) {
            if (curr_deno[i]>0) {  //to avoid divide by 0
                int notes = temp / curr_deno[i];
                if (notes >= 1) {
                    denomCount[i] = notes;
                    temp = temp - (curr_deno[i] * denomCount[i]);
                }
            }
        }

        if (temp > 0) {
            System.out.println(" Exact amount cannot be given with this denominations");

        } else {
            for (int i=0; i<denomCount.length; i++) {
                if (denomCount[i] != 0) {
                    System.out.println(curr_deno[i] + " : " + denomCount[i]);
                }
            }
        }


    }

}
