import com.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test {
    private int[] a;
    private int[] b;


    public Test(int[] a, int[] b) {
        this.a = a;
        this.b = b;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{4, 5, 3, 4, 5, 6, 7}, new int[]{5, 6, 7}},
                {new int[]{1, 4, 7, 8, 8}, new int[]{7, 8, 8}},
                {new int[]{1, 2, 4, 5, 6, 7, 9}, new int[]{5, 6, 7, 9}}
        });
    }


    @org.junit.Test
    public void testAdd() {
        Assert.assertArrayEquals(b, Main.getArrayAfterFour(a));
    }
}
