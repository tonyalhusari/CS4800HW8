public class CheetosDispenserHandler extends SnackDispenseHandler {
    public CheetosDispenserHandler(SnackDispenseHandler next) {
        super(next);
    }
    @Override
    public void handleRequest(Snack snack) {
        if (snack.getName().equals("Cheetos")) {
            System.out.println("Dispensing Cheetos");
        } else {
            super.handleRequest(snack);
        }
    }
}
