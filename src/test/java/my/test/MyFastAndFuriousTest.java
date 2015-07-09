package my.test;

import my.test.category.Fast;
import my.test.category.Furious;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category({Fast.class, Furious.class})
public class MyFastAndFuriousTest {
    @Test
    public void myTest() {
        Assert.assertTrue(true);
    }
}
