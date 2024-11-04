package github_assignment2;

public class FindIndex {
    public static int findFirstIndex(String value, String searchValue) {
        // Find the starting index of searchValue in value
        return value.indexOf(searchValue);
    }

    public static void main(String[] args) {
        String value = "Hello, welcome to the Java world!";
        String searchValue = "Java";

        int index = findFirstIndex(value, searchValue);
        
        if (index != -1) {
            System.out.println("The index of the first character of searchValue in value is: " + index);
        } else {
            System.out.println("searchValue not found in value.");
        }
    }
}
