package my.test;

import my.test.category.Fast;
import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

@Category(Fast.class)
public class MyFastTest {

    @Test
    public void fast() {
        Assert.assertTrue(true);
    }
}
