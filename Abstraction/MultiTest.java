class Person{
    Person(String n,String g,int a){  //This class doesn't get additional details like salary and company information
        name=n;
        gender=g;
        age=a;
    }
    String name, gender;
    int age;
    void show(){
        System.out.println("Name = "+name+"\nGender = "+gender+"\nAge = "+age);
    }
}
class Company extends Person{   //This class doesn't get additional details like salary 
    String company;
    Company(String n,String g,int a, String c){
        super(n, g, a);
        company=c;
    }
    void cshow(){
        System.out.println("Company = "+company);
    }
}
class Salary extends Company{     //This class recieves all relavent details that concern the salary details of an employee
    int salary;
    Salary(String n,String g,int a, String c, int s){
        super(n, g, a, c);
        salary=s;
    }
    void sshow(){
        System.out.print("Salary = "+salary);
    }
}
class MultiTest{
    public static void main(String a[]) {
        Salary p = new Salary("xyz","Female",21,"CTS",67500);
        p.show();
        p.cshow();
        p.sshow();
        System.out.println();
    }
}
