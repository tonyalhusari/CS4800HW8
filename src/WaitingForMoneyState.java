public class WaitingForMoneyState implements StateOfVendingMachine {
    @Override
    public void selectSnack(VendingMachine vendingMachine, Snack snack) {

    }

    @Override
    public void insertMoney(VendingMachine vendingMachine, double amount) {
        vendingMachine.setInsertedMoney(amount);
        vendingMachine.setState(new DispensingSnackState());
    }

    @Override
    public void dispenseSnack(VendingMachine vendingMachine) {

    }
}
