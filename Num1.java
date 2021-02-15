public class Num1
{
    public static void main(String[] args)
    {
        testcase();

        System.out.println("remainder(1,3) -> " + remainder(1, 3));
        System.out.println("remainder(3,4) -> " + remainder(3, 4));
        System.out.println("remainder(-9,45) -> " + remainder(-9, 45));
        System.out.println("remainder(5,5) -> " + remainder(5, 5));
    }

    public static void testcase()
    {
        assert remainder(1, 3) == 1;
        assert remainder(3, 4) == 3;
        assert remainder(-9, 45) == -9;
        assert remainder(5, 5) == 0;
    }

    static public int remainder(int a, int b)
    {
        return (a % b);
    }
}