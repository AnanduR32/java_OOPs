class throwstest{
    int num1,num2;
    void meth1(int n)throws ArithmeticException, NullPointerException{
        num1=n;
        num2=32;
        num2=num2/num1;
        System.out.print(num2);
    }
    void meth2()throws ArithmeticException{
        num1=0;
        num2=24;
        num2=num2/num1;
        System.out.println(num2);
    }
}
class Example{
    public static void main(String[] a){
        throwstest n=new throwstest();
        try{
            n.meth1(8);
            n.meth2();
        }
        catch(ArithmeticException e){
            System.out.println("Error\n"+e);
        }
        catch(Exception e){
            System.out.println("Error\n"+e);
        }
    }
}