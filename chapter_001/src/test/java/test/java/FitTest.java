package test.java;

    import org.junit.Assert;
    import org.junit.Test;
    import ru.job4j.calculator.Fit;

public class FitTest {


    @Test
    public void manWeight(){
        double height = 180;
        double expected = 92;
        double out = Fit.manWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight(){
        double height = 170;
        double expected = 69;
        double out = Fit.womanWeight(height);
        Assert.assertEquals(expected, out, 0.01);
    }
}
