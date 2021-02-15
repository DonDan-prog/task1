public class Num2 
{
    public static void main(String[] args)
    {
        testcase();

        System.out.println("triArea(3,2) -> " + triArea(3,2));
        System.out.println("triArea(7,4) -> " + triArea(7,4));
        System.out.println("triArea(10,10) -> " + triArea(10,10));
    }

    public static void testcase()
    {
        assert triArea(3,2) == 3;
        assert triArea(7,4) == 14;
        assert triArea(10,10) == 50;
    }

    static public double triArea(double a, double h)
    {
        return (a * h) / 2;
    }
}
