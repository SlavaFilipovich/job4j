package test.java;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Point;

public class PointTest {

    @Test
    public void distance(){
        int x1 = 1;
        int x2 = 2;
        int y1 = 1;
        int y2 = 6;
        double expected = 5.1;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out,0.01);
    }
}
