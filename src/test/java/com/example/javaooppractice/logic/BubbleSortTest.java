package com.example.javaooppractice.logic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @DisplayName("Bubble Sort - the simplest sorting algorithm that works by repeatedly swapping the adjacent elements")
    @Test
    void bubble_Sort() {
        // Given
        BubbleSort<Integer> bubbleSort = new BubbleSort<>();

        // When
        List<Integer> actual =bubbleSort.sort(List.of(3, 2, 4, 5, 1));

        // Then
        assertEquals(List.of(1, 2, 3, 4, 5), actual);

    }
}