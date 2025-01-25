package com.example.s29986Bank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class AccountStorageTest {
    @Mock
    private Account account;

    @InjectMocks
    private AccountStorage accountStorage;

    @Test
    void shouldGetAccount() {
        //GIVEN
        accountStorage.addAccount(account);
        when(account.getUserID()).thenReturn(1);

        //WHEN
        Account result = accountStorage.getAccount(1);

        //THEN
        assertEquals(account.getUserID(), result.getUserID());
    }

}