package Practice;

public class Practice {
    public static void main(String[] args) {

        System.out.println(isValid("[[[]]])"));
    }


    public static boolean isValid(String s) {
        int max=s.length()/2;
        if (s.length()%2==1) return false;
        System.out.println(s.length());
        for (int i=0; i<max; i++){
            s=s.replace("[]","");
            s=s.replace("()","");
            s=s.replace("{}","");
        }
        System.out.println(s);
        if (s.equals("")) return true;
        return false;
    }










    public static String longestCommonPrefix(String[] strs) {
        //Finding min length of string array.
        int minLength=strs[0].length();
        for (int i=0; i<strs.length; i++){
            if (strs[i].length()<minLength){
                minLength=strs[i].length();
            }
        }
        System.out.println(minLength);
        String commonPrefix="";
        char checkLetter;
        for(int j=0; j<minLength; j++){
            checkLetter = strs[0].charAt(j);
            for (int i=0; i<strs.length; i++){
                if (strs[i].charAt(j)==checkLetter){
                    System.out.println(strs[i].charAt(j)==checkLetter);
                }else{
                    System.out.println(commonPrefix);
                    return commonPrefix;
                }
            }
            commonPrefix+=strs[0].charAt(j);
            System.out.println(commonPrefix);
        }
        System.out.println(commonPrefix);
        return commonPrefix;

    }

}
