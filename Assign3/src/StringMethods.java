public class StringMethods {
    public static void main(String[] args) {

        String str1 = "Testing Strings";
        String str2 = "testing strings";
        String str3 = "Java";

        
        System.out.println("Testing Equals: " + str1.equals(str2)); 
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str2)); 
        System.out.println("Compare To: " + str1.compareTo(str2)); 
        System.out.println("Length: " + str1.length()); 
        System.out.println("Index Of : " + str1.indexOf("Strings"));
        System.out.println("Char At index 1: " + str1.charAt(1));
        System.out.println("Ends With : " + str1.endsWith("ngs")); 
        System.out.println("Starts With: " + str1.startsWith("Tes")); 
        System.out.println("Replace : " + str1.replace("Strings", "Java")); 
        System.out.println("To String: " + str1.toString()); 
        System.out.println("Concatenation: " + str1.concat("!!!")); 
        System.out.println("Substring: " + str1.substring(6));
        System.out.println("Region Matches: " + str1.regionMatches(true, 6, str2, 6, 5)); 
    }
}
