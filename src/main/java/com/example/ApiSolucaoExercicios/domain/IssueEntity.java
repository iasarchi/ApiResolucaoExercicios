package com.example.ApiSolucaoExercicios.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class IssueEntity {
    @Id
    @Column
    private String description;
}