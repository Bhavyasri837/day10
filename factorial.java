public class factorial {
    int sum(int n)
    {
        if(n==0) return 1;
        return n*sum(n-1);

    }
    public static void main(String args[])
    {
        factorial fa=new factorial();
        int res=fa.sum(5);
        System.out.println(res);
    }
    
}
