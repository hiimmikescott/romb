package lan.zold;

public class Romb {
    public double kerulet(double side, double angle){
        
        double rad = angle * Math.PI / 180;

        return Math.sqrt(side)*Math.sin(rad);

    }
}
