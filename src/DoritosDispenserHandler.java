public class DoritosDispenserHandler extends SnackDispenseHandler {
    public DoritosDispenserHandler(SnackDispenseHandler next) {
        super(next);
    }
    @Override
    public void handleRequest(Snack snack) {
        if (snack.getName().equals("Doritos")) {
            System.out.println("Dispensing Doritos");
        } else {
            super.handleRequest(snack);
        }
    }
}
