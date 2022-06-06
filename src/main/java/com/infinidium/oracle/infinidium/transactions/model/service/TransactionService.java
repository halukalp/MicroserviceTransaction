package com.infinidium.oracle.infinidium.transactions.model.service;

import com.infinidium.oracle.infinidium.transactions.model.entity.Transaction;
import com.infinidium.oracle.infinidium.transactions.utility.Util;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService extends AbstractTransactionService
{
    @Override
    public List<Transaction> findAllByUserID(Integer userID)
    {
        return repository.findAllByUserID(userID);
    }

    @Override
    public List<Transaction> getAll()
    {
        return repository.findAll();
    }

    @Override
    public Transaction save(Transaction entity)
    {
        try
        {
            return repository.save(entity);
        }
        catch (IllegalArgumentException e)
        {
            Util.showExceptionMessage(e);
            return null;
        }
    }

    @Override
    public void deleteByID(Integer id)
    {
        try
        {
            repository.deleteById(id);
        }
        catch (IllegalArgumentException e)
        {
            Util.showExceptionMessage(e);
        }
    }
}
