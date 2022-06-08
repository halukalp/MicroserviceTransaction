package com.infinidium.oracle.infinidium.transactions.controller;

import com.infinidium.oracle.infinidium.transactions.model.entity.Transaction;
import com.infinidium.oracle.infinidium.transactions.model.service.AbstractTransactionService;
import com.infinidium.oracle.infinidium.transactions.model.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api/transaction")
@RestController
public class TransactionController
{
    @Autowired
    private AbstractTransactionService service;

    // api/transaction/userID
    @GetMapping("{userID}")
    public ResponseEntity<List<Transaction>> getTransactionOfUser(@PathVariable Integer userID)
    {
        return ResponseEntity.ok( service.findAllTransactionsOfUser(userID));
    }

    // api/transaction
    @GetMapping
    public ResponseEntity<List<Transaction>> getAll()
    {
        return ResponseEntity.ok( service.getAll() );
    }

    // api/transaction/transactionID
    @DeleteMapping("{transactionID}")
    public ResponseEntity<Transaction> deleteByID(@PathVariable Integer transactionID)
    {
        service.deleteByID(transactionID);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Transaction> save(Transaction transaction)
    {
        Transaction savedTransaction = service.save(transaction);
        return new ResponseEntity<>(savedTransaction, HttpStatus.CREATED);
    }
}
