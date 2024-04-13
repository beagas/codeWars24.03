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





}
