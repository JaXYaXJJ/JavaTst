package HomeWork.vendingMachine.enums;

public enum EProducts {

    COCA_COLA(0,5,"Coca-Cola"),
    FANTA(1,5,"Fanta"),
    SPRITE(2,5,"Sprite"),
    DR_PEPPER(3,7,"Dr. Pepper"),
    MOUNTAIN_DEW(4,8.5,"Mountain Dew"),
    PEPSI(5,5,"Pepsi"),
    DIET_COKE(6,5,"Diet Coke"),
    ARIZONA(7,10,"Arizona"),
    SODA(8,6.5,"Perrier"),
    MINERAL_WATER(9,5.5, "San Pellegrino");

    private int id;
    private double price;
    private String name;

    EProducts(int id, double price, String name) {

        this.id = id;
        this.price = price;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }
}
