class Factorial{
    int sum(int n)
    {
        if(n==1) return 1;
        return n*sum(n-1);
    }

    public static void main(String[]args){
        Factorial ob=new Factorial();
        int res=ob.sum(10);
        System.out.println(res);
    }}