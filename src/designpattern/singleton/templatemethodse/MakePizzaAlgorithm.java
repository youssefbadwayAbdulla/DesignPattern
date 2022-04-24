package designpattern.singleton.templatemethodse;

public abstract class MakePizzaAlgorithm {
    private void backPizza() {
        System.out.println("Baking Pizza.....");
    }

    abstract void definePizzaShape();

    private void putAddons() {
        System.out.println("putting Pizza Addons.....");
    }

    private void heatPizza() {
        System.out.println("Heating pizza.....");
    }
    public void makePizza(){
        backPizza();
        definePizzaShape();
        putAddons();
        heatPizza();
        System.out.println("Pizza is done.....");
    }
}
