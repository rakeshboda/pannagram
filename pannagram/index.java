import java.util.Scanner;

class PangramChecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String input = sc.nextLine();
        boolean isPangram = isPangram(input);
        
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
      
        boolean[] isPresent = new boolean[26];

                str = str.toLowerCase();

        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if ('a' <= c && c <= 'z') {
                isPresent[c - 'a'] = true;
            }
        }

                for (boolean b : isPresent) {
            if (!b) {
                return false;
            }
        }

        return true;     }
}