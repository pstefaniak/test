import junit.framework.TestCase;

public class SomeTest extends TestCase
{
    public void testNotPassing() throws Exception
    {
//..    new ThisShouldCompile();
      fail("one"); 
    }

    public void testTestAaaa() throws Exception
    {
        new ThisShouldCompile();
      fail("two"); 
    }

    public void testThree() throws Exception
    {
        new ThisShouldCompile();
//        fail("three"); 
    }
}
