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
    public void rombTestCalcPerimeter(){
        double actual = this.romb.perimeter(10.0 );
        double expected = 10000;
        Assert.assertEquals(actual, expected, 0.1);
    }
}