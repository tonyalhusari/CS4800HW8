class IdleState implements StateOfVendingMachine {

    @Override
    public void selectSnack(VendingMachine vendingMachine, Snack snack) {
        vendingMachine.setSelectedSnack(snack);
        vendingMachine.setState(new WaitingForMoneyState());
    }

    @Override
    public void insertMoney(VendingMachine vendingMachine, double amount) {
        System.out.println("Machine is idle. Please select a snack first.");
    }

    @Override
    public void dispenseSnack(VendingMachine vendingMachine) {
        System.out.println("Machine is idle. Please select a snack first.");
    }
}