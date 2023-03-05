import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Yandex1Context {
    public static void c() {

        Scanner scan = new Scanner(System.in);
        String newNum = scan.next().replaceAll("[-,+, (, )]", "");
        if (newNum.length() < 9) {
            newNum = "8495" + newNum;
        }
        char[] newNumChar = newNum.toCharArray();
        String result = "";
        for (int i = 0; i < 3; i++) {
            String curentNum = scan.next().replaceAll("[-,+, (, )]", "");
            if (curentNum.length() < 9) {
                curentNum = "8495" + curentNum;
            }
            char[] curentNumChar = curentNum.toCharArray();
            boolean flag = true;

            for (int j = 10; j > 0; j--) {
                if (newNumChar[j] != curentNumChar[j]) {
                    flag = false;
                    break;
                }
            }
            System.out.println();
            System.out.print((flag ? "YES" : "NO"));
        }
    }

    public static void d() {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        if (a == 0){
            if (b == c*c){
                System.out.println("MANY SOLUTIONS");
                return;
            }else {
                System.out.println("NO SOLUTION");
                return;
            }
        }
        if (c < 0){
            System.out.println("NO SOLUTION");
            return;
        }
        int ans = (c*c - b) / a;
        if (a * ans + b != c*c){
            System.out.println("NO SOLUTION");
            return;
        }
        System.out.println(ans);
    }

    public static void f()  {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();


        ArrayList<Integer> l = new ArrayList<>();
        l.add(Math.max(a, c) * (b + d));
        l.add(Math.max(a, d) * (b + c));
        l.add(Math.max(b, c) * (a + d));
        l.add(Math.max(b, d) * (a + c));

        if (Collections.min(l) == l.get(0)) {
            System.out.println(Math.max(a, c) + " " + (b + d));

        } else if (Collections.min(l) == l.get(1)) {
            System.out.println(Math.max(a, d) + " " + (b + c));

        } else if (Collections.min(l) == l.get(2)) {
            System.out.println(Math.max(b, c) + " " + (a + d));

        } else if (Collections.min(l) == l.get(3)) {
            System.out.println(Math.max(b, d) + " " + (a + c));

        }

    }

    public static void g()  {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int m = scan.nextInt();

        if (n == 0 || k == 0 || m == 0){
            System.out.println(0);
            return;
        }
        else if (m > k || k > n || m > n){
            System.out.println(0);
            return;
        }

        int count_z;
        int count_d = 0;
        while (n >= k){
            count_z = n / k;
            count_d += count_z * (k / m);
            n -= count_z * (k / m) * m;

        }
        System.out.println(count_d);
    }
}
