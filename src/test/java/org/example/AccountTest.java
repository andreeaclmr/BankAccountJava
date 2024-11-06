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
}