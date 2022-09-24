/*Sum of all odd digits of any 4 digit number */
public class Qes_6_b {
    public static void main(String[] args) {
        int num, d1, d2, d3, d4;
        int sum = 0;
        num = 1548;
        d1 = num / 1000;
        d2 = num / 100 % 10;
        d3 = num / 10 % 10;
        d4 = num % 10;

        sum = sum+(d1 % 2 != 0 ? d1 : 0);
        sum =  sum +(d2 % 2 != 0 ? d2 : 0);
        sum =  sum +(d3 % 2 != 0 ? d3 : 0);
        sum = sum +(d4 % 2 != 0 ? d4 : 0);
        

        System.out.println("The number is: "+num);
        System.out.println("Sum of the all odd digits of the number is: "+sum);
}
}
