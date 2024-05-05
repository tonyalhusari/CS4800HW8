public class SnickersDispenserHandler extends SnackDispenseHandler {
    public SnickersDispenserHandler(SnackDispenseHandler next) {
        super(next);
    }
    @Override
    public void handleRequest(Snack snack) {
        if (snack.getName().equals("Snickers")) {
            System.out.println("Dispensing Snickers");
        } else {
            super.handleRequest(snack);
        }
    }
}
