public class Num3 
{
    public static void main(String[] args)
    {
        testcase();

        System.out.println("animals(2,3,5) -> " + animals(2, 3, 5));
        System.out.println("animals(1,2,3) -> " + animals(1, 2, 3));
        System.out.println("animals(5,2,8) -> " + animals(5, 2, 8));
    }

    public static void testcase()
    {
        assert animals(2, 3, 5) == 36;
        assert animals(1, 2, 3) == 22;
        assert animals(5, 2, 8) == 50;
    }

    public static int animals(int a, int b, int c)
    {
        return a * 2 + b * 4 + c * 4;
    }
}
