package com.example.s29986Bank;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class AccountServiceTest {

    @Mock
    private AccountStorage accountStorage;

    @InjectMocks
    private AccountService accountService;

//    @Test
//    void shouldRegisterAccount() {
//        //GIVEN
//        doNothing().when(accountStorage).addAccount(null);
//
//        //WHEN
//        accountService.registerAccount(1, 1000);
//
//        //THEN
//        verify(accountStorage, times(1)).addAccount(null);
//    }

    @Test
    void shouldTransfer() {
        //GIVEN
        Account account = new Account(1, 1000);
        when(accountStorage.getAccount(anyInt())).thenReturn(account);

        //WHEN
        Status result = accountService.transfer(1, 1000);

        //THEN
        assertThat(result).isEqualTo(Status.ACCEPTED);
    }

}
