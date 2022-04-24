package designpattern.singleton.solid.liskovsubstitutionprinciple;

import designpattern.singleton.solid.liskovsubstitutionprinciple.Shape;

public class Square extends Shape {
   private int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public int Area() {
        return side*side;
    }
}
