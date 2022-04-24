package designpattern.singleton.templatemethodse;

public class  MakeRectanglePizza extends MakePizzaAlgorithm{
    @Override
    void definePizzaShape() {
        System.out.println("Making the Pizza Rectangle....");
    }
}
