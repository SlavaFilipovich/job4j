package test.java;


    import org.junit.Assert;
    import org.junit.Test;
    import ru.job4j.converter.Converter;

public class ConverterTest {

        @Test
        public void rubleToEuro() {
            int in = 140;
            int expected = 2;
            int out = Converter.rubleToEuro(in);
            Assert.assertEquals(expected, out);
        }

        @Test
        public void rubleToDollar() {
            int in = 240;
            int expected = 4;
            int out = Converter.rubleToDollar(in);
            Assert.assertEquals(expected, out);
        }

        @Test
        public void euroToRuble() {
            int in = 5;
            int expected = 350;
            int out = Converter.euroToRuble(in);
            Assert.assertEquals(expected, out);
        }

        @Test
        public void dollarToRuble() {
            int in = 12;
            int expected = 720;
            int out = Converter.dollarToRuble(in);
            Assert.assertEquals(expected, out);
        }

    }

