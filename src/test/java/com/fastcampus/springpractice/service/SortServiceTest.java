package com.fastcampus.springpractice.service;

import com.fastcampus.springpractice.logic.JavaSort;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortServiceTest {

    private SortService sut = new SortService(new JavaSort<>());

    @Test
    void test() {
        // Given

        // When
        List<String> result = sut.doSort(List.of("3", "1", "2"));

        // Then
        assertEquals(List.of("1", "2", "3"), result);
    }
}