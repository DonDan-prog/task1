public class Num5 
{
    public static void main(String[] args)
    {
        testcase();

        System.out.println("operation(24, 15, 9) -> " + operation(24, 15, 9));
        System.out.println("operation(24, 26, 2) -> " + operation(24, 26, 2));
        System.out.println("operation(15, 11, 11) -> " + operation(15, 11, 11));
    }
    public static void testcase()
    {
        assert "added".equals(operation(24, 15, 9));
        assert "subtracted".equals(operation(24, 26, 2));
        assert "none".equals(operation(15, 11, 11));
    }
    public static String operation(int N, int a, int b)
    {
        if(a + b == N)
            return "added";
        else if(a - b == N)
            return "subtracted";
        else if(a * b == N)
            return "multiplied";
        else if(a / b == N)
            return "divided";
        return "none";
    }
}
