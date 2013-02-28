import junit.framework.TestCase;

public class SomeTest extends TestCase
{
    public void testOne() throws Exception
    {
        new ThisShouldCompile();
      fail("one"); 
    }

    public void testTwo() throws Exception
    {
//      new ThisShouldCompile();
      fail("two"); 
    }

    public void testThree() throws Exception
    {
        new ThisShouldCompile();
        fail("three"); 
    }

    public void testFour() throws Exception
    {
        new ThisShouldCompile();
        fail("four"); 
    }

    public void testFive() throws Exception
    {
        new ThisShouldCompile();
        fail("five"); 
    }

    public void testSix() throws Exception
    {
        new ThisShouldCompile();
        fail("six"); 
    }

    public void testSix1() throws Exception
    {
        new ThisShouldCompile();
        fail("six1"); 
    }

    public void testSix2() throws Exception
    {
        new ThisShouldCompile();
        fail("six2"); 
    }

    public void testSix2() throws Exception
    {
        new ThisShouldCompile();
        fail("six2"); 
    }
}
