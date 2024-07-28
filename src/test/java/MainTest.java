import org.testng.Assert;
import org.testng.annotations.Test;

import static org.example.Main.getSum;

public class MainTest {

    @Test
    public void testGetSum(){
        Assert.assertEquals(getSum(0,0), 0);
        Assert.assertEquals(getSum(5,5), 10);
        Assert.assertEquals(getSum(-5,-5), -10);
    }

}
