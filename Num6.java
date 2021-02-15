public class Num6 
{
    public static void main(String[] args)
    {
        testcase();

        System.out.println("ctoa('A') -> " + ctoa('A'));
        System.out.println("ctoa('m') -> " + ctoa('m'));
        System.out.println("ctoa('[') -> " + ctoa('['));
        System.out.println("ctoa('\\') -> " + ctoa('\\'));
    }
    public static void testcase()
    {
        assert ctoa('A') == 65;
        assert ctoa('m') == 109;
        assert ctoa('[') == 91;
        assert ctoa('\\') == 92;
    }
    public static int ctoa(char a)
    {
        return (int)a;
    }
}
