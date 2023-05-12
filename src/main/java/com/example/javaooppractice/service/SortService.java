package com.example.javaooppractice.service;

import com.example.javaooppractice.logic.JavaSort;
import com.example.javaooppractice.logic.Sort;

import java.util.List;

public class SortService {

    private final Sort<String> sort;

    public SortService(Sort<String> sort) {
        this.sort = sort;
        System.out.println("Implementation: " + sort.getClass().getName());
    }

    public List<String> doSort(List<String> list) {
        return sort.sort(list);
    }
}
