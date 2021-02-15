public class Num7 
{
    public static void main(String[] args)
    {
        testcase();

        System.out.println("addUpTo(3) -> " + addUpTo(3));
        System.out.println("addUpTo(10) -> " + addUpTo(10));
        System.out.println("addUpTo(7) -> " + addUpTo(7));
    }
    public static void testcase()
    {
        assert addUpTo(3) == 6;
        assert addUpTo(10) == 55;
        assert addUpTo(7) == 28;
    }
    public static int addUpTo(int n)
    {
        int ret = 0;
        for(int i = 0; i < n; ++i, ret += i);
        return ret;
    }
}
