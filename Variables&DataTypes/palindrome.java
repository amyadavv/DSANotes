public class palindrome {

    public static boolean  palindromeNumber (int n) {
        int num = n;
        int check = 0;
        int rem = 0;

        while (n > 0) {
            rem = n % 10;
            n = n / 10;
            check = check * 10 + rem;
        }
        
        return num == check;
    }

    public static void main(String[] args) {

        System.out.println(palindromeNumber(1231));
        
    }
    
}
