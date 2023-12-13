package com.example.ApiSolucaoExercicios.controller;
import com.example.ApiSolucaoExercicios.domain.IssueEntity;
import com.example.ApiSolucaoExercicios.service.IssueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/v1/issues")
public class IssueController {

    @Value("${issues}")
    private String issues;


    @Autowired
    private IssueService issueService;

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> findAll(){
        return ResponseEntity.ok(issues);
    }

    @GetMapping("/resolve")
    public ResponseEntity resolve(@RequestParam(name = "issueName") String issueName,
                          @RequestParam Map<String,String> allRequestParams) {

        return issueService.resolve(issueName, allRequestParams);
    }
}
