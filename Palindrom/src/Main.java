public class Main {
    public static void main(String[] args) {

        isPalindrom("madam1346");
    }

    public static boolean isPalindrom(String s) {
        boolean isTrue = false;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(s.length() - 1 - i)) {
                isTrue = true;
            } else{
                isTrue = false;
                break;
            }
        }
        if(isTrue){
            System.out.println("Is Palendrom");
        } else System.out.println("Not Palendrom");

        return isTrue;
    }

}


