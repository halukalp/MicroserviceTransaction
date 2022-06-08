package com.infinidium.oracle.infinidium.transactions.model.service;

import com.infinidium.oracle.infinidium.transactions.model.entity.Transaction;
import com.infinidium.oracle.infinidium.transactions.model.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public abstract class AbstractTransactionService implements EntityService<Transaction, Integer>
{
    @Autowired
    protected TransactionRepository repository;

    public abstract List<Transaction> findAllTransactionsOfUser(Integer userID);
}
