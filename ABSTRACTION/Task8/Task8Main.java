package Task8;

import java.util.Scanner;

public class Task8Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Test test=new Test();
        test.display(new Task81(sc.nextInt()));
        test.display(new Task82(sc.nextInt()));
        test.display(new Task83(sc.nextInt()));
    }
}
