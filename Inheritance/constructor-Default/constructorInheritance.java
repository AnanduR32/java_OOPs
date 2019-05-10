class constructorInheritance{
    constructorInheritance(){
        System.out.println("myClass");
    }
    public static void main(String args[]){
        C obj = new C();
        obj.i=1;
        obj.j=2;
        obj.k=3;
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
    C(){
        System.out.println("C");
    }
    void showk(){
        System.out.println(k);
    }
}
