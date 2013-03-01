import junit.framework.TestCase;

public class SomeTest extends TestCase
{
    public void testAaaa() throws Exception
    {
        new ThisShouldCompile();
        //fail("Aaaaa"); 
    }

    public void testPassing() throws Exception
    {
      new ThisShouldCompile();
//      fail("two"); 
    }

    public void testNotPassing() throws Exception
    {
        new ThisShouldCompile();
        fail("notPassing"); 
    }

}
