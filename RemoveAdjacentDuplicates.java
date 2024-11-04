package github_assignment2;

public class RemoveAdjacentDuplicates {
    public static String removeAdjacentDuplicates(String s) {
        StringBuilder stack = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            int len = stack.length();
            if (len > 0 && stack.charAt(len - 1) == ch) {
                stack.deleteCharAt(len - 1); // Remove the last character if it's the same
            } else {
                stack.append(ch); // Add the current character to the stack
            }
        }
        
        return stack.toString();
    }

    public static void main(String[] args) {
        String input = "abbaca";
        String result = removeAdjacentDuplicates(input);
        System.out.println("Result after removing adjacent duplicates: " + result);
    }
}
