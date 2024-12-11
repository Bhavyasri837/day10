public class normalfib {
    public static void main(String args[])
    {
        int  a=0;
        int b=1;System.out.println(+a+"\n"+b);
        int n=10;
        for(int i=2;i<=n;i++)
        {
            int c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
    
}
