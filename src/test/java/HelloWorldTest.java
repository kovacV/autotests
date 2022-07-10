import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldTest {

    @Test
    public void test1() {
        System.out.println("Hello world");
        System.out.println("newB");
        Assert.assertEquals(1, 1);
        //edited
    }
}
