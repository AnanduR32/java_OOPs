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
class constructorInheritance{
    constructorInheritance(){
        System.out.println("myClass");
    }
    public static void main(String args[]){
        new constructorInheritance();         //This leads to the execution of the main class constructor first 
        C obj = new C();                      //C extends B which inturn extends A, thereofore the order of execution of constructors is from first parent to last child
        obj.i=1;
        obj.j=2;
        obj.k=3;
        obj.showi();
        obj.showj();
        obj.showk();
        
    } 
}
