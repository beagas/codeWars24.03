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
}
