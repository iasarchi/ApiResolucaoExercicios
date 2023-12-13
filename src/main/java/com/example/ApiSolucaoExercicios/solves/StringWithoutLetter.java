package com.example.ApiSolucaoExercicios.solves;

import java.util.Map;

public class StringWithoutLetter implements SolveInterface<String> {
    @Override
    public String solve(Map<String, String> allRequestParams) {
        String text = allRequestParams.get("text");
        String letter = allRequestParams.get("letter");
        return text.replaceAll(letter, "");
    }
}
