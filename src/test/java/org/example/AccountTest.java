package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    @DisplayName("Create Account")
    void creationAccount() {

        // Given

        // When
Account account = new Account();
        // Then
double balance = account.getBalance();
assertEquals(0, balance);
    }
}