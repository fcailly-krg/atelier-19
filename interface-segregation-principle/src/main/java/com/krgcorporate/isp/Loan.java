package com.krgcorporate.isp;

public interface Loan extends Payment {
    void initiateLoanSettlement();
    void initiateRePayment();
}