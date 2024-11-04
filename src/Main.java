
public class Main {
    public static void main(String[] args) {

        Example1 example1 = new Example1();
        Example1 example2 = new Example2();
        int a1 = example1.getA();
        int a2 = example2.getA();
        int b1 = example1.getB();
        int b2 = example2.getB();
        System.out.println("Valor de A1 Clase Example 1 : " + a1 );
        System.out.println("Valor de A2 Clase Example 2 : " + a2 );
        System.out.println("Valor de B1 Clase Example 1 : " + b1 );
        System.out.println("Valor de B2 Clase Example 2 : " + b2 );

        example1.setA(example1.getA());
    }
}