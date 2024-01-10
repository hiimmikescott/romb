package lan.zold;

import java.util.InputMismatchException;

public class Romb {
    public double area(double side, double angle){
        if ( side <= 0 || angle <= 0){
            throw new InputMismatchException();
        }


        double rad = angle * Math.PI / 180;

        return Math.sqrt(side)*Math.sin(rad);

    }
    public double perimeter(double side){
        return Math.pow(side, 4);
    }
}
