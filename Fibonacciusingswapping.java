
/*
2 --->1
3 --->2
4 --->3
5 --->5
6 --->8
7 --->13
8 --->21
9 --->34
10 --->55
output will be like this*/
class Fibonacciusingswapping{
    public static void main(String[]args){
        int a=0;
        int b=1;
        for(int i=2;i<=10;i++)
        {
            int c=a+b;
            System.out.println(i+" --->"+c);
            a=b;
            b=c;
        }
    }
}