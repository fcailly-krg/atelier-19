package com.krgcorporate.lsp;

import java.math.BigDecimal;

public class SavingsAccount extends WithdrawableAccount {

    @Override
    protected void deposit(BigDecimal amount) {
        // Deposit into CurrentAccount
    }

    @Override
    protected void withdraw(BigDecimal amount) {
        // Withdraw from CurrentAccount
    }
}
