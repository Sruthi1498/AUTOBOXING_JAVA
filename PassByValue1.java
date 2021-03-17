public class PassByValue1 {
    int a = 10;

    public int add(PassByValue1 b)
    {
        b.a += 100;
        return b.a;
    }

    public static void main(String[] args) {
        PassByValue1 o = new PassByValue1();

        System.out.println(o.a);
        o.add(o);
        System.out.println(o.a);

    }
}
