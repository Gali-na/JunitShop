import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class TestShopCVS {
    Map<String, Integer> RemainsShop;

    @Before
    public void Initialization() {
        RemainsShop = Stock.RemainsShops(new HashMap<String, Integer>());
    }

    @After
    public void WriteTestInFile() {
        Stock.WriteFile(RemainsShop);
    }

    @Test
    public void TestApple() {
        Fruits apple = new Apple();
        String expend = "apple";
        Assert.assertEquals(expend, apple.getNAme());
    }

    @Test
    public void TestBanana() {
        Fruits banana = new Banana();
        String expend = "banana";
        Assert.assertEquals(expend, banana.getNAme());
    }

    @Test
    public void TestPeach() {
        Fruits peach = new Peach();
        String expend = "peach";
        Assert.assertEquals(expend, peach.getNAme());
    }
}

