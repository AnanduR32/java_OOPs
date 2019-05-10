import java.util.*;
public class stringOps{
    public static void main(String a[]){
        int s1,s2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String str1=sc.nextLine();
        System.out.print("Enter another string : ");
        String str2=sc.nextLine();
        String str3;
        if(str1.indexOf(str2)!=-1){
            System.out.println("Index of "+str2+" in "+str1+" is "+str1.indexOf(str2));
        }else{
            System.out.print(str2+" not present in "+str1);
            System.out.println();
        }
        try{
            System.out.print("Enter value of start index of substring to be extracted from "+str1+" : ");
            s1=sc.nextInt();
            System.out.print("Enter value of end index value of substring, to be extracted from "+str1+" : ");
            s2=sc.nextInt();
            System.out.println("The substring obtained wtth start and end indices ("+s1+","+s2+") is "+str1.substring(s1, s2));
        }catch(Exception e){
            System.out.println("Invalid indices entered");
        }
        System.out.println(str1+" in lowercase form is "+str1.toLowerCase());
        System.out.println(str2+" in uppercase form is "+str2.toUpperCase());
        if(str1.equals(str2)){
            System.out.println(str2+" equals "+str1);
            System.out.println();
        }else{
            System.out.print(str2+" does not equals "+str1);
            System.out.println();
        }
        System.out.println("The length of "+str1+" is "+str1.length());
        

    }
}
