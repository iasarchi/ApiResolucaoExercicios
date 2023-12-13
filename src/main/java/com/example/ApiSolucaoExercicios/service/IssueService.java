package com.example.ApiSolucaoExercicios.service;
import com.example.ApiSolucaoExercicios.solves.SolveInterface;
import com.example.ApiSolucaoExercicios.solves.MiniMaxSum;
import com.example.ApiSolucaoExercicios.solves.StringWithoutLetter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class IssueService {

    private Map<String, SolveInterface> solves = Map.of(
            "stringWithoutLetter", new StringWithoutLetter(),
            "StairCase", new MiniMaxSum()
    );

    public ResponseEntity resolve(String issueName, Map<String,String> allRequestParams) {
        SolveInterface solveInterface = solves.get(issueName);
        return ResponseEntity.ok(solveInterface.solve(allRequestParams));
    }
}
