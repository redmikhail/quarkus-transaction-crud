package com.transactionapp;

import javax.persistence.Entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import java.sql.Date;

import javax.persistence.Column;

@Entity
public class TxnObj extends PanacheEntity {
    @Column(name = "transaction_id")
    private String transactionNumber;
    @Column(name = "amount")
    private Integer transactionAmount;
    @Column(name = "userId")
    private Integer userId;
    @Column(name = "last_login")
    private Date login;
    
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    
   public Date getLogin() {
        return login;
    }

    public void setLogin(Date login) {
        this.login = login;
    } 
    
    
    
    
    

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
