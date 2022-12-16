import java.util.*;
class Prime{
    public static boolean checkPrime(int num){
        for(int i=2;i<=num/2;i++){
            if(num%i==0)
                return false;
        }
        return true;
    }
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number to find whether prime or not");
       int num=sc.nextInt();
       boolean result=checkPrime(num);
       if(result==true)
        System.out.println(num+" is a PRIME NUMBER");
       else
        System.out.println(num+" is not a PRIME NUMBER");
    }
}