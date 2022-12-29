package DesignPatterns.Adapter;

public class SwanAdapter implements Quackable {
    private final Swan swan;
    public SwanAdapter(Swan swan) {
        this.swan = swan;
    }
    @Override
    public void quack() {
        swan.honk();
    }
}
