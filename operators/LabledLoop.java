package operators;

import java.sql.SQLOutput;

public class LabledLoop {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i == 1 && j % 2 != 0) {
                    System.out.println(j);
                }
                if (i == 2 && j % 2 == 0) {
                    System.out.println(j);
                }
                if (i % 3 == 0) {
                    break;
                }
            }
        }
    }
}
