
/*
* Difference between average of all even digits except divisible by 4 and
* avearge of all odd digits except divisble by 3 of any 4 digit number
*/

import java.util.Scanner;
public class Qes_6_c {
    public static void main(String[] args) {
      int num,d1,d2,d3,d4;
      System.out.println("Enter a 4 digit number : ");
      Scanner sc=new Scanner(System.in);
      num=sc.nextInt();
      
sc.close();
      int avgEvenCount=0,avgOddCount=0;
      float diff,avgEven=0,avgOdd=0;

      d1=num/1000;
      d2=num/100%10;
      d3=num/10%10;
      d4=num%10;
//Average of all even digits except divisible by 4
avgEven = avgEven+((d1%2==0)&&(d1%4 !=0)? d1:0);
avgEvenCount=avgEvenCount +((d1%2==0)&&(d1%4 !=0) ? 1:0);

avgEven = avgEven+((d2%2==0)&&(d2%4 !=0)? d2:0);
avgEvenCount=avgEvenCount +((d2%2==0)&&(d2%4 !=0) ? 1:0);

avgEven = avgEven+((d3%2==0)&&(d3%4 !=0)? d3:0);
avgEvenCount=avgEvenCount +((d3%3==0)&&(d3%3 !=0) ? 1:0);

avgEven = avgEven+((d4%2==0)&&(d4%4 !=0)? d4:0);
avgEvenCount=avgEvenCount +((d4%2==0)&&(d4%4 !=0) ? 1:0);
//Average of all odd digits except divisible by 3
avgOdd = avgOdd +((d1%2!=0)&&(d1%3!=0)? d1:0);
avgOddCount=avgOddCount +((d1%2!=0)&&(d1%3!=0)? 1:0);

avgOdd = avgOdd +((d2%2!=0)&&(d2%3!=0)? d2:0);
avgOddCount=avgOddCount +((d2%2!=0)&&(d2%3!=0)? 1:0);

avgOdd = avgOdd +((d3%2!=0)&&(d3%3!=0)? d3:0);
avgOddCount=avgOddCount +((d3%2!=0)&&(d3%3!=0)? 1:0);

avgOdd = avgOdd +((d4%2!=0)&&(d4%3!=0)? d4:0);
avgOddCount=avgOddCount +((d4%2!=0)&&(d4%3!=0)? 1:0);

avgEven=avgEven/avgEvenCount;
avgOdd=avgOdd/avgOddCount;

diff=avgEven-avgOdd;
System.out.println("Entered number is : "+num);
System.out.println("thee diffrence is : "+diff);
    }

}
