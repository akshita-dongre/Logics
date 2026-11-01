
public class FirstCode{


    public static void main(String[] args) {
        int  a = 2 ;
        char b = 'a';
        float c = 10 ;
        String d = "aks";
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        SecondCode x = new SecondCode();
        System.out.println(x.a);
        IO.println(x.getNumber(10));
        IO.println(x.getNumber());
        x.setNumber(9);
        IO.println(x.a);
        SecondCode z = new SecondCode();
        z.setNumber(2);
        IO.println(z.a);


    }


}