import java.util.NoSuchElementException;

public abstract class SnackDispenseHandler {

    private SnackDispenseHandler nextHandler;

    public SnackDispenseHandler(SnackDispenseHandler next){
        this.nextHandler = next;
    }

    public void setNextHandler(SnackDispenseHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(Snack snack) {
        if(nextHandler != null){
            nextHandler.handleRequest(snack);
        }
        else {
            throw new NoSuchElementException("Snack not found");
        }
    }
}
