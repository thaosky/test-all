package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmailModel {
    private String customerName;
    private String segment;
    private String loanId;
    private String loanPurpose;
    private String loanAmount;
    private String currency;
    private String username;
    private String purposeDescription;
    private String comment;
}
