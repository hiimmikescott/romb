import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lan.zold.Romb;

public class rombTest {
     Romb romb;
    @BeforeTest
    public void test(){
        this.romb = new Romb();
    }
    @Test
    public void rombTestCalc(){
        double actual = this.romb.kerulet(30.0 , 35);
        double expected = 0.573;
        Assert.assertEquals(actual, expected, 0.1);
    }
}
