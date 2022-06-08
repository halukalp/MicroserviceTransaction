package com.infinidium.oracle.infinidium.transactions.model.repository;

import com.infinidium.oracle.infinidium.transactions.model.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Integer>
{
    // select * from transactions where user_id = ?;
    List<Transaction> findAllByUserID(Integer userID);
}
