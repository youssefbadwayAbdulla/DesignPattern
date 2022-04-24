package designpattern.singleton.templatemethodse;

public class  MakeRoundedPizza extends MakePizzaAlgorithm{
    @Override
    void definePizzaShape() {
        System.out.println("Making the Pizza round");
    }
}
