package com.krgcorporate.lsp;

import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public class BankingAppWithdrawalService {
    private Account account;

    public void withdraw(BigDecimal amount) {
        account.withdraw(amount);
    }

    public static void main(String[] args) {
        Account myFixedTermDepositAccount = new FixedTermDepositAccount();
        myFixedTermDepositAccount.deposit(new BigDecimal(1000.00));

        BankingAppWithdrawalService withdrawalService = new BankingAppWithdrawalService(myFixedTermDepositAccount);
        withdrawalService.withdraw(new BigDecimal(100.00));
    }
}
