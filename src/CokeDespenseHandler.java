class CokeDispenserHandler extends SnackDispenseHandler {

    public CokeDispenserHandler(SnackDispenseHandler next) {
        super(next);
    }
    @Override
    public void handleRequest(Snack snack) {
        if (snack.getName().equals("Coke")) {
            System.out.println("Dispensing coke");
        } else {
            super.handleRequest(snack);
        }
    }
}
