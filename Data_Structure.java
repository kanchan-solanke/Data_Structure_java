/*  que:
You are given N nodes,
each having unique value ranging from [1, N],
how many different binary search tree can be created using all of them.

Input
First line will contain an integer, T, number of test cases.
 Then T lines follow, where each line represent a test case.
 Each test case consists a single integer, N, where N is the number of nodes in the binary search tree.

Output
For each test case, find the number of different binary search trees
that can be created using these nodes
// use double to store number because it is factorial
* */
import java.util.Scanner;
public class BinarySearchTree_DS {
    public static double fact(double number)
    {
        int fac=1;
        for(int i=1;i<=number;i++)
        {
            fac=fac*i;
        }
        return fac;
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter number :");
        double number=scanner.nextInt();
        double num1=fact(number*2);
        double num2=fact(number+1);
        number=fact(number);

        double value=num1/(num2*number);
        System.out.println(value+" Tree can be created using  "+number+" nodes");
    }

}