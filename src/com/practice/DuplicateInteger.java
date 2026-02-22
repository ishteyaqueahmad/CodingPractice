package com.practice;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateInteger {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 2, 4, 1, 5,5);
        Set<Integer> duplicates =
                list.stream()
                        .filter(n -> Collections.frequency(list, n) > 1)
                        .collect(Collectors.toSet());
        System.out.println(duplicates);
    }


}
