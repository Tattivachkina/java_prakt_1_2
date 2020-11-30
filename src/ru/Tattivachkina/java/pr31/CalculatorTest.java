package ru.Tattivachkina.java.pr31;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void calculate() {
        Calculator calculator = new Calculator(1,2,'+');
        Assert.assertNotNull(calculator);
    }

    @Test
    public void test2() {
        Calculator calculator2 = new Calculator(1,2,'-');
        Assert.assertEquals(-3.0, calculator2.getResult(),1.5);
    }
}