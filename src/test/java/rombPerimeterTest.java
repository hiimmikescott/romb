import java.util.InputMismatchException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lan.zold.Romb;

public class rombPerimeterTest {

    Romb romb;
    @BeforeTest
    public void test(){
        this.romb = new Romb();
    }
     @Test
    public void rombTestCalcPerimeter_10(){
        double actual = this.romb.perimeter(10.0 );
        double expected = 10000;
        Assert.assertEquals(actual, expected, 0.1);
    }
        @Test
    public void rombTestCalcPerimeter_5(){
        double actual = this.romb.perimeter(5 );
        double expected = 20;
        Assert.assertEquals(actual, expected, 0.0);
    }      
    @Test( expectedExceptions = InputMismatchException.class )
    public void testCalcPerimeter_Zero_side() {
        this.romb.perimeter(0);       
    }
}