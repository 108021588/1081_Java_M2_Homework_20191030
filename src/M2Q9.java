import java.util.Scanner;

public class M2Q9 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int b=0;
        int c=0;
        for (int i=1;i<=n;i++){
            if (n%i==0&&m%i==0){
                b=i;
            }
        }
        for (int i=n*m;i>=1;i--){
            if (i%n==0&&i%m==0){
                c=i;
            }
        }
        System.out.println(b);
        System.out.println(c);
    }
}
