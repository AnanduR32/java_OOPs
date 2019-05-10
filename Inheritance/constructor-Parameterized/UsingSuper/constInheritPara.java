class constInheritPara{
    constInheritPara(){
        System.out.println("myClass");
    }
    public static void main(String args[]){
        C obj = new C(1,2,3);
        obj.showi();
        obj.showj();
        obj.showk();
        
    } 
}
class A{
    private int i;
    A(int x,int y, int z){
        i=x;
        System.out.println("A");
    }
    void showi(){
        System.out.println(i);
    }
}
class B extends A{
    int j;
    B(int x,int y, int z){
        super(x,y,z);
        j=y;
        System.out.println("B");
    }
    void showj(){
        System.out.println(j);
    }
}
class C extends B{
    
    int k;
    C(int x,int y,int z){
        super(x,y,z);
        k=z;
    }
    void showk(){
        System.out.println(k);
    }
}
