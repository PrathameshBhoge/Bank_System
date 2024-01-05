package com.bootcoding;

import com.bootcoding.metrics.MetricsCollector;
import com.bootcoding.metrics.TransactionByGenderMetrics;
import com.bootcoding.model.BankTransaction;
import com.bootcoding.reader.TransactionFileReader;

import java.util.List;

public class BankApplication {
    public static void main(String[] args) {
        TransactionFileReader fileReader =  new TransactionFileReader();
        String filePath = "C:/Java Projects/archive (5)/bank_transactions1.csv";
        List<BankTransaction> bankTransactions = fileReader.read(filePath);
        MetricsCollector metric = new TransactionByGenderMetrics();
        metric.collect(bankTransactions);
    }
}