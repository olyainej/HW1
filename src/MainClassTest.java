import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass
{
    @Test
    public void testGetLocalNumber()
        {
            int a = getLocalNumber();
            if (a == 14)
                System.out.println("testGetLocalNumber is passed, number is " + a);
            else
                System.out.print("testGetLocalNumber is NOT passed, number is " + a);
        }
    @Test
    public void testGetClassNumber()
    {
        int a = getClassNumber();
        if (a>45)
            System.out.println("testGetClassNumber is passed, number is " + a);
        else
            System.out.println("testGetClassNumber is NOT passed, number is " + a);
    }
    @Test
    public void testGetClassString()
    {
        String s = getClassString();
        boolean f = false;
        if (s.contains("hello")||s.contains("Hello"))
            f = true;
        if (f == false)
            Assert.fail("string doesn't contain word hello or Hello, string was " + s);
        else
            System.out.println("testGetClassString is passed");

    }
}
