/*Sum of product of consecutive digits of any 4 digit number? Supoose
num=1234 then output= 4*3+3*2+2*1 */
public class Qes_5_4 {
    public static void main(String[] args) {
        int num=1234;
        int sop=0;//sop :sum of Product
        sop=((num %10)*((num/10)%10))+ (((num/10)%10)*((num/100)%10))+(((num/100)%10)*((num/1000)%10));
        System.out.println("Sum of product of consecutive digits : "+sop);
    }
}
