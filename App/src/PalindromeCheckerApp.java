/**
 * ============================================================
 * UC4 - Character Array Based Palindrome Check
 * ============================================================
 *
 * Objective:
 * To check whether a given string is a palindrome by
 * converting it into a character array and comparing
 * characters using the two-pointer technique.
 *
 * A palindrome is a word that reads the same forward
 * and backward (example: "level", "madam").
 *
 * Flow:
 * 1. Convert the string into a char[] array
 * 2. Initialize two pointers (start and end)
 * 3. Compare characters at both pointers
 * 4. Move pointers inward until they cross
 * 5. Display the result
 *
 * Data Structure Used:
 * char[]
 *
 * Key Concepts:
 * - Character Array (char[])
 * - Array Indexing
 * - Two-Pointer Technique
 * - Conditional Statements
 * - Time Complexity Awareness (O(n))
 * - Console Output
 *
 * @author Vasantha .R
 * @version 4.0
 */

public class PalindromeCheckerApp {

    /**
     * Main method – Entry point of the Java application.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Input string to be checked
        String input = "level";

        // Convert string to character array
        char[] characters = input.toCharArray();

        // Initialize two pointers
        int start = 0;
        int end = characters.length - 1;

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Two-pointer comparison loop
        while (start < end) {

            // Compare characters from both ends
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break; // Exit loop on mismatch
            }

            start++; // Move start pointer forward
            end--;   // Move end pointer backward
        }

        // Display result
        System.out.println("Input text: " + input);
        System.out.println("Is it a Palindrome? : " + isPalindrome);

    } // End of main method

} // End of class


