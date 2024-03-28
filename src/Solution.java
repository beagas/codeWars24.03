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
        long neededTimeSeconds = (Math.round((double)neededPowerValue * initialSeconds / powerValue));
        int newMinutes = (int)((neededTimeSeconds) / 60);
        int newSeconds = (int)((neededTimeSeconds) % 60);
        String answer = newMinutes + " minutes " + newSeconds + " seconds";
        return answer;

    }
}
