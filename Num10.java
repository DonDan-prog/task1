public class Num10 
{
    public static void main(String[] args)
    {
        testcase();

        System.out.println("abcmath(42, 5, 10) -> " + abcmath(42, 5, 10));
        System.out.println("abcmath(5, 2, 1) -> " + abcmath(5, 2, 1));
        System.out.println("abcmath(1, 2, 3) -> " + abcmath(1, 2, 3));
    }
    public static void testcase()
    {
        assert abcmath(42, 5, 10) == false;
        assert abcmath(5, 2, 1) == true;
        assert abcmath(1, 2, 3) == false;
    }
    public static boolean abcmath(int a, int b, int N)
    {
        for(int i = 0; i < b; ++i, a += a);
        return a % N == 0;
    }
}
