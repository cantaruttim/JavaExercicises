package BankTransfer.model;

public abstract class Deposit extends BankTransfer {

    private Double value;

    public Deposit() {};
    public Deposit(Double value) {
        this.value = value;
    };

    public Double getValue() {
        return value;
    }

    public void deposit(Double value) {
        Validate();
    }

    @Override
    public void Validate() {
        if (this.value > this.value) {
            System.out.println("Value not sufficient");
        } else {
            this.value += value;
        }

    }

    @Override
    public void Processor() {

    }

}
