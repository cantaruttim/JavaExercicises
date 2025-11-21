package BankTransfer.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Deposit extends BankTransfer {

    private double value;

    public Deposit(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    @Override
    public void validate() {
        if (value <= 0) {
            throw new IllegalArgumentException("Valor do depósito inválido");
        }
    }

    @Override
    public void processor() {
        // Aqui é onde de fato ocorre o depósito
        System.out.println("Depósito de R$ " + value + " realizado com sucesso.");
    }
}
