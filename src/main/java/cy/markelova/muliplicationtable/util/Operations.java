package cy.markelova.muliplicationtable.util;

public class Operations {

    public static void printMultiplicationTable() {
        for (int i = 2; i <= 5; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }

    public static void printMultiplicationTable(int number) {
        for (int i = 2; i <= number; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d * %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }
}
