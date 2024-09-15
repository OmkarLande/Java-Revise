//check is string is pallindrome or not if yes print the length of string and if not then print ASCII value of first character of string. Before checking pallindrome convert it to lowercase.
//input always be in capatalize form

public class CapgeminiQueOne {
    public static void main(String[] args) {
        String str = "AADAMO";
        StringBuilder sb = new StringBuilder(str.toLowerCase());
        sb.reverse();
        if(str.toLowerCase().equals(sb.toString())){
            System.out.println("Pallindrome");
            System.out.println("Length of string is: "+str.length());
        }else{
            System.out.println("Not Pallindrome");
            System.out.println("ASCII value of first character is: "+(int)str.charAt(0));
        }
    }

}
