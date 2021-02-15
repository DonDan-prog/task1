public class Num9 
{
    public static void main(String[] args)
    {
        testcase();

        int[] first_test = {1, 5, 9};
        int[] second_test  = {3, 4, 5};
        int[] third_test = { 2 };
        int[] four_test = {};

        System.out.println("sumOfCubes([1, 5, 9]) -> " + sumOfCubes(first_test));
        System.out.println("sumOfCubes([3, 4, 5]) -> " + sumOfCubes(second_test));
        System.out.println("sumOfCubes([2]) -> " + sumOfCubes(third_test));
        System.out.println("sumOfCubes([]) -> " + sumOfCubes(four_test));
    }
    public static void testcase()
    {   
        int[] first_test = {1, 5, 9};
        int[] second_test  = {3, 4, 5};
        int[] third_test = { 2 };
        int[] four_test = {};

        assert sumOfCubes(first_test) == 855;
        assert sumOfCubes(second_test) == 216;
        assert sumOfCubes(third_test) == 8;
        assert sumOfCubes(four_test) == 0;
    }
    public static int sumOfCubes(int[] arr)
    {
        int ret = 0;
        for(int i : arr)
            ret += i * i * i;
        return ret;
    }
}
