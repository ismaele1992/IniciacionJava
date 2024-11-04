public class Example1 {

    private int a = 1;
    protected int b = 5;
    public int c;

    public int getA(){
        this.a = this.a + 1;
        return this.a;
    }

    public void setA(int a){
        this.a = a;
    }

    public int getB(){
        return this.b;
    }

    public int getC(){
        return this.c;
    }
}
