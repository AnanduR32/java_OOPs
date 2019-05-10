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
    int i;
    A(){
    
        System.out.println("A");
    }
    void showi(){
        System.out.println(i);
    }
}
class B extends A{
    int j;
    B(){
        
        System.out.println("B");
    }
    void showj(){
        System.out.println(j);
    }
}
class C extends B{
    int k;
    C(int x,int y,int z){
        i=x;
        j=y;
        k=z;
    }
    C(){
        System.out.println("C");
    }
    void showk(){
        System.out.println(k);
    }
}
