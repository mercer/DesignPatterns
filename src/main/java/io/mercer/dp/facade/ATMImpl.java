package io.mercer.dp.facade;

public class ATMImpl implements ATM {
    private Bank bank;
    private Printer printer;
    private CashRegister cashRegister;
    private CardReader cardReader;

    @Override
    public void extractMoney(int cardNumber, int sum, boolean wantsReceipt) {
        int money = bank.extract(cardNumber, sum);
        if (wantsReceipt) {
            printer.printReceipt();
        }
        cashRegister.spitOutMoney(money);
    }

    @Override
    public boolean enterPin(int pin) {
        return cardReader.validate(pin);
    }

}
