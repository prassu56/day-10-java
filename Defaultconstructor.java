class A{
    int c;
    String b;
     public void a()
    {
        this.c=345;
        this.b="hello prassu";
    }
    void display()
    {
        System.out.println(b+" "+c);
    }
}
public class Defaultconstructor{
    public static void main(String[]args){
        A s=new A();
        s.a();
        s.display();
    }
}