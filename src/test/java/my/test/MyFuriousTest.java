package my.test;

import my.test.category.Furious;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(Furious.class)
public class MyFuriousTest {

    @Test
    public void furious() {
        Assert.assertTrue(true);
    }
}
