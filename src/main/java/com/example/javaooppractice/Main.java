package com.example.javaooppractice;

import com.example.javaooppractice.logic.BubbleSort;
import com.example.javaooppractice.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new BubbleSort<>();

        System.out.println("[result " + sort.sort(Arrays.asList(args)));
    }
}
