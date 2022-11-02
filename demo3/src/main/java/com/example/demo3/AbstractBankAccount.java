package com.example.demo3;

abstract class AbstractBankAccount {

    public final String BANK = "JavaBank Indonesia";

    protected String accountName;
    protected String accountNum;
    protected int balance;

    public AbstractBankAccount(String name, String num, int balance){
        this.accountName = name;
        this.accountNum = num;
        this.balance = balance;
    }

    abstract public void deposit(int amt);
    abstract public int getBalance();
    abstract public String getBankName();

    public void withdraw(int amt){}
    public void setAccountName(String name){
        this.accountName = name;
    }
}
