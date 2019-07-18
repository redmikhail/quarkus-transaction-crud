package com.transactionapp;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class TxnObj extends PanacheEntity {
    @Column
    private String transactionNumber;
    @Column
    private Integer transactionAmount;

    public String getTransactionNumber() {
        return transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public Integer getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(Integer transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    

    


}
