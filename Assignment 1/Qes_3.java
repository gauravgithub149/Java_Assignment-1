//3. Write a java program for temperature conversion
public class Qes_3 {
    public static void main(String[] args) {
        int c = 38;
        int new_f = ((c * 9) / 5) + 32;
        System.out.println("celsius is " + c + " convert to Farenhite is :" + new_f);
        int f = 108;
        int new_c = ((f - 32) * 5) / 9;
        System.out.println("Farenhite is " + f + " convert to Celcius is : " + new_c);
    }
}
