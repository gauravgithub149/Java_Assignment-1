//5.1 Sum of all digits of any 4 digit numbers
public class Qes_5_1 {
    public static void main(String[] args) {
        int sum=0;
        int x=4653;
        System.out.println("The entered digit is : "+x);
        sum=sum+(x%10)+(x/10)%10+(x/100)%10+(x/1000)%1000;
        System.out.println("Sum all 4 digit number = "+sum);

    }
}
