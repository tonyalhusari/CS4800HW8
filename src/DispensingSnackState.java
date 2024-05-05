public class DispensingSnackState implements StateOfVendingMachine {
    @Override
    public void selectSnack(VendingMachine vendingMachine, Snack snack) {

    }

    @Override
    public void insertMoney(VendingMachine vendingMachine, double amount) {

    }

    @Override
    public void dispenseSnack(VendingMachine vendingMachine) {
        vendingMachine.setState(new IdleState());
        Snack selectedSnack = vendingMachine.getSelectedSnack();
        double insertedMoney = vendingMachine.getInsertedMoney();

        if (insertedMoney >= selectedSnack.getPrice()) {
            if (selectedSnack.getQuantity() > 0) {
                selectedSnack.setQuantity(selectedSnack.getQuantity() - 1);
                vendingMachine.getHandler().handleRequest(selectedSnack);
            } else {
                System.out.println("Sorry, " + selectedSnack.getName() + " is out of stock.");
                System.out.println("please pickup your money and select a new snack.");
            }
        }else{
            System.out.println("Insufficient money, please try again.");
            System.out.println("please pickup your money.");
        }

    }
}
