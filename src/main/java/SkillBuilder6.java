
/**
 * SkillBuilder6 is a class for completing the Skill
 * Builder 6 assignment in Java.
 *
 * @author <You>
 * @version 1.0
 */

public class SkillBuilder6 {

    private static final int start = 0;
    private static final int T = 1;
    private static final int Y = 2;


    public static String findTYPattern(String s)
    {   int i;
        String sub = "";
        int CS = start;
        for (i = 0; i < s.length() || CS != Y; i++);
        char L = s.charAt(i);
        if (L == 't' || L =='T'){
            CS = T;
            if (CS == T){
                sub += L;
            }
            if (L =='y' || L == 'Y' && CS == T)
                CS = Y;
        }
        return sub;
    }

}
