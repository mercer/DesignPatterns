package io.mercer.dp.facade;

public interface ATM {
    void extractMoney(int cardNumber, int sum, boolean wantsReceipt);

    boolean enterPin(int pin);
}
