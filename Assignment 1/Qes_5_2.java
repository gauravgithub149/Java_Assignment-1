//find the face value and position value of any 4 digit number
public class Qes_5_2 {
    public static void main(String[] args) {
        int num=3214;
        int num1,num2,num3,num4;
        num1=num/1000;num=num%1000;
        num2=num/100;num=num%100;
        num3=num/10;num=num%10;
        num4=num;
        System.out.println("Face Value of "+num1+" is "+num1);
        System.out.println("Face Value of "+num2+" is "+num2);
        System.out.println("Face Value of "+num3+" is "+num3);
        System.out.println("Face Value of "+num4+" is "+num4);
        num=3214;
        num1=num/1000;num=num%1000;num1=num1*1000;
        num2=num/100;num=num%100;num2=num2*100;
        num3=num/10;num=num%10;num3=num3*10;
        num4=num;
        System.out.println("Place Value of "+num1+" is "+num1);
        System.out.println("Place Value of "+num2+" is "+num2);
        System.out.println("Place Value of "+num3+" is "+num3);
        System.out.println("Place Value of "+num4+" is "+num4);
    }
}
