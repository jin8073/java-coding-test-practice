import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        String answer = "";
        for (int i = 0; i < a.length(); i++) {
            char alpha = a.charAt(i);
            if (alpha < 97) {
                alpha +=32;
                answer += alpha;
            } else {
                alpha -= 32;
                answer += alpha;
            }
        }
        
        System.out.println(answer);
    }
}
