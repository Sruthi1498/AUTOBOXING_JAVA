public class AutoBoxing {
    public static void main(String[] args) {

        int i = 10;
        Integer a = i;
        System.out.println(i);

        // error while autoboxing because int cannot be null
        Integer n = null;
        int j = n;
        System.out.println(j);

        boolean b;
        b = (Boolean)null;
        System.out.println(b);



    }
}
