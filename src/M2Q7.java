import java.util.Scanner;

public class M2Q7 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i=1;i<=n;i++){
            int a=scn.nextInt();
            int b=scn.nextInt();
            int c=scn.nextInt();
            if (a>=60&&b>=60&&c>=60){
                System.out.println("P");
            }
            else if (a<60&&a+b+c>=220||b<60&&a+b+c>=220||c<60&&a+b+c>=220){
                System.out.println("P");
            }
            else if (a+b>118&&c+b>118&&a+c>118){
                System.out.println("M");
            }
            else if (a>=80||b>=80||c>=80){
                System.out.println("M");
            }
            else {
                System.out.println("F");
            }
        }
    }
}
