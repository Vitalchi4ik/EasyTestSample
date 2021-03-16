package ru.stqa.pft.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SquareTest {

    @Test
    public void testSquare(){
        Square s = new Square();
        Assert.assertEquals(s.square(5), 24);
    }
}
