package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    @DisplayName("Create Account")
    void when_account_is_created_balance_is_zero() {

        // Given

        // When
Account account = new Account();
        // Then
double balance = account.getBalance();
assertEquals(0, balance);
    }

    @Test
    void createAccount() {

        // When
        Account account = new Account(1000);
        // Then
    double Balance = account.getBalance();
        double balance = 1000;
        assertEquals(1000, balance);
    }

@Test
    void when_deposit_amount_must_be_sum_in_balance(){

        //Given
Account account = new Account(1000);
        // When
account.deposit(500);
        // Then
double balance = account.getBalance();
assertEquals(1500, balance);

}

}