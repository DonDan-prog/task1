public class Num4 
{
    public static void main(String[] args)
    {
        testcase();

        System.out.println("profitableGamble(0.2, 50, 9) -> " + profitableGamble(0.2, 50, 9));
        System.out.println("profitableGamble(0.9, 1, 2) -> " + profitableGamble(0.9, 1, 2));
        System.out.println("profitableGamble(0.9, 3, 2) -> " + profitableGamble(0.9, 3, 2));
    }
    
    public static void testcase()
    {
        assert profitableGamble(0.2, 50, 9) == true;
        assert profitableGamble(0.9, 1, 2) == false;
        assert profitableGamble(0.9, 3, 2) == true;
    }

    public static boolean profitableGamble(double prob, double prize, double pay)
    {
        return (prob * prize > pay) ? true : false;
    }
}
