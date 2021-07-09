package com.krgcorporate.isp;

public interface Payment {

    void initiatePayments();

    Object status();

    //Loan related methods
    void initiateLoanSettlement();
    void initiateRePayment();
}
