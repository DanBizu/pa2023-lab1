/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l1homework;

/**
 *
 * @author DanBizu
 */
public class L1Homework {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if (args.length != 1) {
            System.out.println("Incorrect amount of arguments!");
            System.exit(-1);
        }

        // Validation
        int n;
        try {
            n = Integer.parseInt(args[0]);
            System.out.println(n);
            LatinSquare ls = new LatinSquare(n);
            if (n < 1000) {
                ls.printByLine();
            }
            
        } catch (NumberFormatException e) {
            System.out.println("Argument must be an integer");
            System.exit(-1);
        }
    }

    private static class LatinSquare {
        private final int n;
        int[][] matrix;
        
        LatinSquare(int n) {
            this.n = n;
            long t1 = 0;
            if (n >= 10_000) {
                t1 = System.currentTimeMillis();
            }
            matrix = createLatinSquare(n);
            if (n >= 10_000) {
                long t2 = System.currentTimeMillis();
                System.out.println("Creation took: " + (t2 - t1));
            }
        }

        public static int[][] createLatinSquare(int n) {
            int[][] matrix = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i + j + 1) % n != 0) {
                        matrix[i][j] = (i + j + 1) % n;
                    } else {
                        matrix[i][j] = n;
                    }
                }
            }

            return matrix;
        }
        
        public void printByLine() {
            StringBuilder line = new StringBuilder();
            for (int i = 0; i < this.n; i++) {
                for (int j = 0; j < this.n; j++) {
                    line.append(matrix[i][j]);
                    if (j - 1 < this.n) {
                        line.append(" ");
                    }
                }
                System.out.println("Line:" + i);
                System.out.println(line);
                line.setLength(0);
            }
        }
        
        public void printByColumn() {
            StringBuilder column = new StringBuilder();
            for (int i = 0; i < this.n; i++) {
                for (int j = 0; j < this.n; j++) {
                    column.append(matrix[j][i]);
                    column.append("\n");
                }
                System.out.println("Column:" + i);
                System.out.println(column);
                column.setLength(0);
            }
        }
    }

}
