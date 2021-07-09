package com.krgcorporate.lsp;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public class BankingAppWithdrawalService {

    private final WithdrawableAccount withdrawableAccount;

    public void withdraw(BigDecimal amount) {
        withdrawableAccount.withdraw(amount);
    }
}
