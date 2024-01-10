import java.util.InputMismatchException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lan.zold.Romb;

public class rombAreaTest {
     Romb romb;
    @BeforeTest
    public void test(){
        this.romb = new Romb();
    }
    @Test
    public void rombTestCalckerulet_30_35(){
        double actual = this.romb.area(30.0 , 35);
        double expected = 3.1416;
        Assert.assertEquals(actual, expected, 0.1);
    }
    @Test 
    public void rombTestCalckerulet_100_90(){
        double actual = this.romb.area(100.0 , 90);
        double expected = 10.0;
        Assert.assertEquals(actual, expected, 0.1);
    }
    @Test( expectedExceptions = InputMismatchException.class )
    public void testCalckerulet_Zero_Side() {
        this.romb.area(0, 1);        
    }
    @Test( expectedExceptions = InputMismatchException.class )
    public void testCalcRadius_Zero_Angle() {
        this.romb.perimeter(0);        
    }
}
