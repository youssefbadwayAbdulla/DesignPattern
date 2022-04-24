package designpattern.singleton.adapter;

public class DuckTestDrive {
    public static void main(String[] args) {
        MallardDuck mallardDuck=new MallardDuck();
        WildTurkey wildTurkey=new WildTurkey();
        TurkeyAdapter turkeyAdapter=new TurkeyAdapter(wildTurkey);

        System.out.println("The Turkey says....");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("The Duck says....");
        testDuck(mallardDuck);

        System.out.println("The Adapter says....");
        testDuck(turkeyAdapter);



    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
