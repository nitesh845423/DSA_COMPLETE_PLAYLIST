/*import java.util.Scanner;

public class toggleproblem {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Uppercase -> Lowercase
            if (ch >= 'A' && ch <= 'Z') {
                result += (char)(ch + 32);
            }
            // Lowercase -> Uppercase
            else if (ch >= 'a' && ch <= 'z') {
                result += (char)(ch - 32);
            }
            // Space, number, special character
            else {
                result += ch;
            }
        }

        System.out.println("Converted String: " + result);

        sc.close();
    } 
}

 */

import java.util.Scanner;
public class toggleproblem {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter String: ");
    String s=sc.next();
    String result="";
    for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        if(ch>='A'&&ch<='Z'){
            result+=(char)(ch+32);;
        }
        else if(ch>='a'&&ch<='z'){
            result+=(char)(ch-32);;
        }
        else{
            result+=ch;
        }
    }
    System.out.println("result: "+ result);
}
}  