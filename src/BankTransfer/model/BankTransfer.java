package BankTransfer.model;


public abstract class BankTransfer {

    public final void execute() {
        validate();
        processor();
        logRegister();
    }

    public abstract void validate();
    public abstract void processor();

    private void logRegister() {
        System.out.println("Operation executed at: " +
                java.time.LocalDateTime.now());
    }

}
