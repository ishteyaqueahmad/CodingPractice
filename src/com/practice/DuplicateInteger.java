package com.practice;

import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateInteger {
    List<Integer> list = List.of(1, 2, 3, 2, 4, 1, 5);
    Set<Integer> duplicates =
            list.stream()
                    .filter(n -> Collections.frequency(list, n) > 1)
                    .collect(Collectors.toSet());

}
