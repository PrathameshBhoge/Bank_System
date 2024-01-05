package com.bootcoding.metrics;


import com.bootcoding.model.BankTransaction;

import java.util.List;

public interface MetricsCollector {

    public void collect(List<BankTransaction> transactions);
}
