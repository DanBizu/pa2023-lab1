/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l1homework;

/**
 *
 * @author dhuum
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
        try {
            int n = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Argument must be an integer");
            System.exit(-1);
        }

        int n = Integer.parseInt(args[0]);
        System.out.println(n);
    }

    private class LatinSquare {
        private int n;
        int[][] matrix;
        
        LatinSquare(int n) {
            this.n = n;
            matrix = createLatinSquare(n);
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
