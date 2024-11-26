public class SkillBuilder6 {

    private static final int start = 0;
    private static final int T = 1;
    private static final int Y = 2;

    public static String findTYPattern(String s) {
        String sub = "";
        int CS = start;


        for (int i = 0; i < s.length(); i++) {
            char L = s.charAt(i);

            if (CS == start) {
                if (L == 't' || L == 'T') {
                    CS = T;
                    sub += L;
                }
            }

            else if (CS == T) {
                sub += L;

                if (L == 'y' || L == 'Y') {
                    CS = Y;
                }
            }


            if (CS == T && i == s.length() - 1) {
                sub = "";
            }


            if (CS == Y) {
                break;
            }
        }


        return sub.length() > 0 ? sub : "";
    }

}







