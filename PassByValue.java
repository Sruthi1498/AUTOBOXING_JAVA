public class PassByValue {
    int a = 10;

    public int add(int a)
    {
        a += 10;
        return a;
    }

    public static void main(String[] args) {
        PassByValue p = new PassByValue();
        System.out.println();
        System.out.println(p.a);
        System.out.println(p.add(20));
        System.out.println(p.a);
    }
}
