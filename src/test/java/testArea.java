import org.junit.Assert;
import org.junit.Test;

import static java.lang.Math.PI;
import static java.lang.Math.pow;


public class testArea {

    private double calculate(int radius) {
        double S = PI * pow(radius, 2);
        return S;
    }

    @Test
    public void testArea() throws Exception {

        Assert.assertEquals(7853.98, this.calculate(50), 0.01);

    }
}
