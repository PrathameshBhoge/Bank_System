package com.bootcoding.model;

import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
public class BankTransaction {
    private String transactionId;
    private String customerId;
    private String customerDob;
    private char gender;
    private String location;
    private double accountBalance;
    private String transactionDate;
    private long transactionTime;
    private double amountInr;
}
