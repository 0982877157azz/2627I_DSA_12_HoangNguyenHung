import java.util.*;
public class BalancedBracket {
    public static boolean isMatch(char open, char close){
        return (open == '(' && close == ')')
                || (open == '[' && close == ']')
                || (open == '{' && close == '}');
    }
    public static boolean checkBalancedBracket(char[] arr){
        Deque<Character> stack = new ArrayDeque<>();
        for (int i = 0; i < arr.length; i++){
            if (arr[i] == '(' || arr[i] == '[' ||  arr[i] == '{'){
                stack.push(arr[i]);
            } else if (arr[i] == ')' || arr[i] == ']' || arr[i] == '}' ) {
                if( stack.isEmpty() || !isMatch(stack.pop(), arr[i])){
                    return false;
                };
            }
            else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++){
            String line = sc.nextLine();
            boolean result = checkBalancedBracket(line.toCharArray());
            System.out.println(result);
        }
    }
}
