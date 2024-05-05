public class KitKatDispenserHandler extends SnackDispenseHandler {
    public KitKatDispenserHandler(SnackDispenseHandler next) {
        super(next);
    }
    @Override
    public void handleRequest(Snack snack) {
        if (snack.getName().equals("Kitkat")) {
            System.out.println("Dispensing Kitkat");
        } else {
            super.handleRequest(snack);
        }
    }
}
