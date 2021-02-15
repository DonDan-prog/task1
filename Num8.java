public class Num8 
{
    public static void main(String[] args)
    {
        testcase();

        System.out.println("nextEdge(8, 10) -> " + nextEdge(8, 10));
        System.out.println("nextEdge(5, 7) -> " + nextEdge(5, 7));
        System.out.println("nextEdge(9, 2) -> " + nextEdge(9, 2));
    }
    public static void testcase()
    {
        assert  nextEdge(8, 10) == 17;
        assert nextEdge(5, 7) == 11;
        assert nextEdge(9, 2) == 10;
    }
    public static int nextEdge(int a, int b)
    {
        return a + b - 1; // a + b < c - first rule of existence of triangle
    }
}
