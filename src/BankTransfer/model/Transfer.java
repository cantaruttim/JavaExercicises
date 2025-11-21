package BankTransfer.model;

public class Transfer extends BankTransfer {

    private double value;
    private String accountFrom;
    private String accountDestiny;

    public Transfer(double value, String accountFrom, String accountDestiny) {
        this.value = value;
        this.accountFrom = accountFrom;
        this.accountDestiny = accountDestiny;
    }

    public double getValue() {
        return value;
    }

    public String getAccountFrom() {
        return accountFrom;
    }

    public String getAccountDestiny() {
        return accountDestiny;
    }

    @Override
    public void validate() {
        if (value <= 0) {
            throw new IllegalArgumentException("Value insufficient to transfer");
        }

        if (accountFrom == null || accountDestiny == null) {
            throw new IllegalArgumentException("Not allow null accounts");
        }

        if (accountFrom.equals(accountDestiny)) {
            throw new IllegalArgumentException("Accounts must not be equals");
        }

        System.out.println("Transfer completed successfully!");
    }

    @Override
    public void processor() {
        System.out.println("Transfering R$ " + value +
                " from " + accountFrom +
                " to " + accountDestiny + ".");
    }

    @Override
    public String toString() {
        return "Transfer{" +
                "value=" + value +
                ", From='" + accountFrom + '\'' +
                ", To='" + accountDestiny + '\'' +
                '}';
    }
}
