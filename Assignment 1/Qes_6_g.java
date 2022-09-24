import java.util.Scanner;

public class Qes_6_g {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m,n1,n2,n3,n4,m1,m2,m4,m3;
        int sum;
        System.out.println("Enter first 4 digit number : ");
        n=sc.nextInt();
        System.out.println("Enter second 4 digit number : ");
        m=sc.nextInt();
sum=0;
    n1=n/1000;
    n2=n/100 % 10;
    n3=n/10 % 10;
    n4=n%10;

    m1=m/1000;
    m2=m/100 %10;
    m3=m/10 %10;
    m4=m %10;

    sum += (n1 %2 == 0) && (m1 %2 != 0) ? n1 * m1 : 0;
    sum += (n2 %2 == 0) && (m2 %2 != 0) ? n2 * m2 : 0;
    sum += (n3 %2 == 0) && (m3 %2 != 0) ? n3 * m3 : 0;
    sum += (n4 %2 == 0) && (m4 %2 != 0) ? n4 * m4 : 0;
    System.out.println("The sum of number and corresponding value is: "+sum);
    sc.close();
    }
}
