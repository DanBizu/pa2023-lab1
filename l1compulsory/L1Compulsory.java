/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package l1compulsory;

/**
 *
 * @author Dan Bizu
 */
public class L1Compulsory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hello World!");
        String[] languages = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
        int n = (int) (Math.random() * 1_000_000);
        n *= 3;
        n += 0b10101;
        n += 0xFF;
        n *= 6;
        
        DigitSumComputer dsc;
        dsc = new DigitSumComputer(n);
        
        int sum = dsc.recursiveDigitSum();
        System.out.println("Willy-nilly, this semester I will learn " + languages[sum]);
    }
    
    private static class DigitSumComputer {
        private final int n;
        
        DigitSumComputer(int n) {
            this.n = n;
        }
        
        private static int computeDigitSum(int n) {
            int sum = 0;
            
            while (n > 0) {
                sum += n % 10;
                n = n/10;
            }
            
            return sum;
        }
        
        private int recursiveDigitSum() {
            int digitSum = computeDigitSum(n);
            
            while (digitSum > 9) {
                digitSum = computeDigitSum(digitSum);
            }
            
            return digitSum;
        }
    }
    
}
