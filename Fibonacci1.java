/*
0-->0
1-->1  
2-->1  
3-->2  
4-->3  
5-->5  
6-->8  
7-->13 
8-->21 
9-->34 
10-->55
output should be like this*/

class Fibonacci1{
    public static int fib(int n){
        if(n==0||n==1)
        {
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[]args){
        int n=10;
        for(int i=0;i<=10;i++)
        {
            int res=fib(i);
            System.out.println(i+"-->"+res);
        }
    }
}