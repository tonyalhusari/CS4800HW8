public class VendingMachine {
    private StateOfVendingMachine state;
    private SnackDispenseHandler handler;
    private Snack[] snacks;
    private Snack selectedSnack;
    private double insertedMoney;


    public VendingMachine(Snack[] snacks){
        state = new IdleState();
        handler = new CokeDispenserHandler(new PepsiDispenserHandler(new CheetosDispenserHandler
                        (new DoritosDispenserHandler(new KitKatDispenserHandler
                        (new SnickersDispenserHandler(null))))));
        this.snacks = snacks;
    }
    public Snack getSelectedSnack(){
        return selectedSnack;
    }

    public double getInsertedMoney() {
        return insertedMoney;
    }
    public SnackDispenseHandler getHandler(){
        return handler;
    }

    public String getState(){
        return state.getClass().getSimpleName();
    }
    void setState(StateOfVendingMachine state) {
        this.state = state;
    }
    public void setSelectedSnack(Snack snack) {
        this.selectedSnack = snack;
    }
    public void setInsertedMoney(double amount) {
        this.insertedMoney = amount;
    }

    void selectSnack(int selectedSnack) {
        Snack snack = snacks[selectedSnack-1];
        state.selectSnack(this, snack);
    }

    void insertMoney(double amount) {
        state.insertMoney(this, amount);
    }

    void dispenseSnack() {
        state.dispenseSnack(this);
    }


}
