package com.example.ApiSolucaoExercicios.solves;

import java.util.Map;

public interface SolveInterface<T> {

    String solve(Map<String,String> allRequestParams);
}
