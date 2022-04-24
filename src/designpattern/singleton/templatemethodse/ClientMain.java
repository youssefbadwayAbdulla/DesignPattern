package designpattern.singleton.templatemethodse;

public class ClientMain {
    public static void main(String[] args) {
        MakePizzaAlgorithm algorithm=new MakeRectanglePizza();
        algorithm.makePizza();
        System.out.println("----------------------------------------------");
        MakePizzaAlgorithm pizzaAlgorithm=new MakeRoundedPizza();
        pizzaAlgorithm.makePizza();
    }}
