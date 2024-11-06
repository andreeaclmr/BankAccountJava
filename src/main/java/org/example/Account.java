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
}

