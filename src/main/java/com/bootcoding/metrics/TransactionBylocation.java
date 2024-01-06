package com.bootcoding.metrics;

import com.bootcoding.model.BankTransaction;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransactionBylocation implements MetricsCollector{

    @Override
    public void collect(List<BankTransaction> transactions) {

        Map<String, Map<Character, Long>> locationGenderCount = transactions.stream()
                .collect(Collectors.groupingBy(BankTransaction::getLocation,
                        Collectors.groupingBy(BankTransaction::getGender, Collectors.counting())));

        locationGenderCount.forEach((location, genderCounts) -> {
            System.out.println("Location: " + location);
            genderCounts.forEach((gender, count) ->
                    System.out.println("Gender: " + gender + ", Count: " + count));
        });
    }
}
