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
        this.romb.kerulet(30.0);
    }
}
