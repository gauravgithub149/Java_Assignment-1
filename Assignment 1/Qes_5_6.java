//find bitwise and , or , and xor of 2nd and 4th digit of any 4 digit number
public class Qes_5_6 {
    public static void main(String[] args) {
       int num=1234;
       int m,n,temp;
       m=((num/10)%10);
       n=((num/1000)%10);
       temp=m|n;
       System.out.println("Bitwise OR value of 2nd :"+m+" and"+" 4th "+n+" is = "+temp); 
       temp=m&n;
       System.out.println("Bitwise AND value of 2nd :"+m+" and"+" 4th "+n+" is = "+temp); 
       temp=m^n;
       System.out.println("Bitwise XOR value of 2nd :"+m+" and"+" 4th "+n+" is = "+temp); 
    }
}
