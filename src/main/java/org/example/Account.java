package org.example;

public class Account {
   private double balance;

   public Account(double balance) {
      this.balance = balance;
   }

   public Account() {
      this.balance = 0;
   }

   public double getBalance() {
      return balance;
   }

   public void deposit(double amount) {
      if (amount < 0) return;
this.balance += amount;
   }
}

