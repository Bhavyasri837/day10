public class fibonacci1 {
    public static int fib(int n)
    {
        if(n==0||n==1)
        return n;
    return fib(n-1)+fib(n-2);
    }
public static void main(String args[])
{
int n=10;
for(int i=0;i<=n;i++)
{
    int res=fib(i);
    System.out.println(i+"="+res);
}
}
}