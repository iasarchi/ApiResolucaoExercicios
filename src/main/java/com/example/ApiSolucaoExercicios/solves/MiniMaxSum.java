package com.example.ApiSolucaoExercicios.solves;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

public class MiniMaxSum implements SolveInterface<String> {
    @Override
    public String solve(Map<String, String> allRequestParams) {
        String array = allRequestParams.get("array");

        List<Integer> arr = Stream.of(array.replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Collections.sort(arr);
        long firstResult = 0;
        long secondResult = 0;
        for (int i = 0; i < 4; i++) {
            firstResult += arr.get(i);
            secondResult += arr.get(i + 1);
        }
        return firstResult + " " + secondResult;
    }

}
