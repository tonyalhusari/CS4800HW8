public class PepsiDispenserHandler extends SnackDispenseHandler {
    public PepsiDispenserHandler(SnackDispenseHandler next) {
        super(next);
    }

    @Override
    public void handleRequest(Snack snack) {
        if (snack.getName().equals("Pepsi")) {
            System.out.println("Dispensing Pepsi");
        } else {
            super.handleRequest(snack);
        }
    }
}
