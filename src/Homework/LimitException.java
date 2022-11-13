package Homework;

public class LimitException extends Exception{
    String message;
    private double remainingAmount;

    public LimitException(String message, double remainingAmount) {
        super(message);
        this.message = message;
        this.remainingAmount = remainingAmount;
    }

    public double getRemainingAmount() {

        return remainingAmount;
    }
}
