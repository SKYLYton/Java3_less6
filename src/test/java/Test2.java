import com.example.Main;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class Test2 {
    private int[] a;
    private boolean b;


    public Test2(int[] a, boolean b) {
        this.a = a;
        this.b = b;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 4, 1, 1, 1, 4}, true},
                {new int[]{1, 1, 1, 1, 1}, false},
                {new int[]{1, 2, 4, 5, 6, 7, 9}, false},
                {new int[]{4, 4, 4, 4, 4, 4, 4}, false}
        });
    }


    @org.junit.Test
    public void testAdd() {
        Assert.assertEquals(b, Main.checkArray(a));
    }
}
