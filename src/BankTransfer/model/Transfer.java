package BankTransfer.model;

public class Transfer  extends BankTransfer {

    private Double value;

    public Transfer() {};
    public Transfer(Double value) {
        this.value = value;
    };


    public Double getValue() {
        return value;
    }

    public void withdraw(Double value) {
        Validate();
    }

    @Override
    public void Validate() {
        if (this.value < 0) {
            System.out.println("Value not sufficient");
        } else {
            this.value -= value;
        }
    }

    @Override
    public void Processor() {

    }


}
