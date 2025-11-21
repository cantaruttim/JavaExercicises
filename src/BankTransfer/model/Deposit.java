package BankTransfer.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Deposit extends BankTransfer {

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
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        System.out.println(date.format(format));
    }

    @Override
    public String toString() {
        return "Deposit{" +
                "value=" + value +
                '}';
    }
}
