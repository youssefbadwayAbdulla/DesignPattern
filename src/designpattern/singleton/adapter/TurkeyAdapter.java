package designpattern.singleton.adapter;

public class  TurkeyAdapter implements Duck{
    //composition
    Turkey turkey;

    //wrapping
    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    //Delegation
    @Override
    public void quack() {
        turkey.gobble();
    }
    //Delegation
    @Override
    public void fly() {
        turkey.fly();
    }
}
