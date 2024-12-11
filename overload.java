public class overload {
    static void a()
    {
        System.out.println("hi");
    }
    static void a(int a)
    {
        System.out.println(a);
    }
    static void a(int b,int c)
    {
        System.out.println(b+c);
    }
    public static void main(String args[])
    {
        a();
        a(12);
        a(12,80);

    }

}
