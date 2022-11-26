package HomeWork.vendingMachine.enums;

public enum ECoins {

    TEN_AGOROT(0.10),
    ONE_SHEKEL(1),
    TWO_SHEKEL(2),
    FIVE_SHEKEL(5),
    TEN_SHEKEL(10);

    private double value;

    ECoins(double value) {

        this.value = value;
    }

    public double getValue() {
        return value;
    }
}
