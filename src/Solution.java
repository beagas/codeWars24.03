public class Solution {
    public static String replace(final String s) {
        return s.replaceAll("[AEIOUaeiou]", "!"); //coding and coding....
    }

        static String removeExclamationMarks(String s) {
            return s.replaceAll("!","");
        }

    public static boolean collinearity(int x1, int y1, int x2, int y2) {
        if((x1==0&&y1==0)||(x2==0&&y2==0)){
            return true;
        }if(x1==0 && x2==0||y1==0&&y2==0){
            return true;
        }if(x1==0 && y2==0||x2==0&&y1==0){
            return false;
        }if(x1==0 || y2==0||x2==0||y1==0){
            return false;
        }if (((x2*10000) / x1)==((y2*10000) / y1)){
            return true;
        }else{
            return false;
        }
    }

        public static int cockroachSpeed(double x){
            int speed = (int) Math.floor((x*1000)/36);
            return speed;
        }

    public static int paperWork(int n, int m) {
        int allPapers = 0;
        if (n > 0 && m > 0) {
            allPapers = n * m;
        }
        return allPapers;
    }
    public static String getTime(String neededPower, int minutes, int seconds, String power)
    {
        int initialSeconds = minutes * 60 + seconds;
        int neededPowerValue = Integer.parseInt(neededPower.substring(0, neededPower.length() - 1));
        int powerValue = Integer.parseInt(power.substring(0, power.length() - 1));
        long neededTimeSeconds = (long) Math.ceil((double)neededPowerValue * initialSeconds / powerValue);
        int newMinutes = (int)((neededTimeSeconds) / 60);
        int newSeconds = (int)((neededTimeSeconds) % 60);
        String answer = newMinutes + " minutes " + newSeconds + " seconds";
        return answer;

    }

        public static String getTime1(String neededPower, int minutes, int seconds, String power) {
            int p1 = Integer.valueOf(neededPower.replace("W",""));
            int p2 = Integer.valueOf(power.replace("W",""));
            int s = (int)Math.ceil((minutes * 60. + seconds) * p1 / p2);
            return String.format("%d minutes %d seconds", s/60, s%60); //%d į šitą poziciją turės grįžti sveikas skaičius
                                                                       //s/60 grąžina sveikąsias dalis
                                                                        // s%60 grąžina dalybos iš 60 liekaną
        }

    public static String hexColor(String codes) {
        String ans = "";
        if (codes.isEmpty()) {
            ans = "black";
            return ans;
        }
        String[] seperateCodes = codes.trim().split("\\s+");
        int red = Integer.parseInt(String.valueOf(seperateCodes[0]));//^anchors to the start of the string
        int green = Integer.parseInt(String.valueOf(seperateCodes[1]));//
        int blue = Integer.parseInt(String.valueOf(seperateCodes[2]));
        int max = Math.max(red,Math.max(green,blue));
        if (red == max && green != max && blue != max) {
            ans = "red";
        }
        if (red != max && green == max && blue != max) {
            ans = "green";
        }
        if (red != max && green != max && blue == max) {
            ans = "blue";
        }
        if (red == max && green != max && blue == max) {
            ans = "magenta";
        }
        if (red == max && green == max && blue != max) {
            ans = "yellow";
        }
        if (red != max && green == max && blue == max) {
            ans = "cyan";
        }
        if (red == max && green == max && blue == max && red != 0 && green != 0 && blue != 0) {
            ans = "white";
        }
        if (red == 0 && green == 0 && blue == 0) {
            ans = "black";
        }
        return ans;
    }

    static boolean stepThroughWith(String s) {
       if (s == null|| s.length()<2){
        return false;}
        for (int i = 1; i < s.length(); i++) {
            if(s.charAt(i) == s.charAt(i-1)){
                return true;
            }
        }
        return false;
    }

    static boolean stepThroughWithh(String s) {
        return s.matches(".*([a-zA-Z])\\1.*");//. - bet koks ženklas
                                                    // * - nulį arba daugiau kartų
                                                    // [a-zA-Z] - bet kokia raidė
                                                    // \\1 - patikrina kad antras ženklas  sutampa su anksčiau buvusiu simboliu
    }

//    public static String decode(int[] code, int key) {
//        String alphabet = "abcdefghijklmnopqrstuvwxyz";
//        char[] charArray = alphabet.toCharArray();
//        String keey = Integer.toString(key);
//        int[] dekey = new int[keey.length()];
//        char[] word = new char[0];
//        for (int i = 1; i <= code.length; i++) {
//            word = new char[]{charArray[code[i]-dekey[((i - 1) % dekey.length)]]};
//        }
//        String singleWord = String.valueOf(word);
//        return singleWord;
//    }



public static String decode(int[] code, int key) {
    if (code == null || code.length == 0) {
        return ""; // Handle empty code
    }
    String alphabet = "abcdefghijklmnopqrstuvwxyz";
    char[] letter = alphabet.toCharArray();
//   int[] dekey = key.split("");
    StringBuilder decodedMessage = new StringBuilder();

    for (int i = 0; i < code.length; i++) {
        int newIndex = (code[i] - dekey[i % dekey.length]);
        decodedMessage.append(letter[newIndex]);
    }
    return decodedMessage.toString();
}



//public static String decode(int[] code, String key) {
//    if (code == null || code.length == 0 || key == null || key.length() == 0) {
//        return ""; // Handle empty code, empty key, or both
//    }
//
//    String alphabet = "abcdefghijklmnopqrstuvwxyz";
//
//    // Ensure key length is less than or equal to code length to avoid out-of-bounds access
//    int keyLength = Math.min(code.length, key.length());
//    int[] shiftValues = new int[keyLength];
//
//    // Extract shift values from the key string
//    for (int i = 0; i < keyLength; i++) {
//        shiftValues[i] = Character.getNumericValue(key.charAt(i)) % alphabet.length(); // Ensure shift stays within alphabet range
//    }
//
//    StringBuilder decodedMessage = new StringBuilder();
//    for (int i = 0; i < code.length; i++) {
//        int shift = shiftValues[i % keyLength]; // Use key cyclically for longer messages
//        int newIndex = (code[i] - shift + alphabet.length()) % alphabet.length();
//        decodedMessage.append(alphabet.charAt(newIndex));
//    }
//
//    return decodedMessage.toString();
//}


}
