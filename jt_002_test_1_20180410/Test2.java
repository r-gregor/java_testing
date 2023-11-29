/*
file: Test2.java
*/

public class Test2
{
    int count = 0;
    public static void main(String args[])
    {
        for (int i = 0; i < 1000001; i++)
        {
            int prd = i * 2;
            System.out.println("factor " + i + " multiplied by 2: " + prd);
        }
    }
}

/*
$> time java Test2 &> /dev/null && time python3 Test2.py &> /dev/null

real    0m0.204s
user    0m0.000s
sys     0m0.031s

real    0m1.521s
user    0m1.497s
sys     0m0.015s
*/