package main.java.com.wagmi.finance.strings;

/*
 TODO[Student]: String utilities
 - Read `StringUtilsTest` to understand expectations.
 - Ensure `sanitizeDescription` handles null/empty, collapses whitespace, and removes non-alphanumerics.
 - Ensure `matchesDatePattern` strictly validates YYYY-MM-DD with leap years and correct ranges.
 - Note: Keep behavior consistent with tests; refactor for readability if desired.
*/

public final class StringUtils {
    private StringUtils() {
    }

    public static String sanitizeDescription(String input) {
        // stub: trim, collapse spaces, remove invalid chars
        throw new UnsupportedOperationException("Not implemented");
    }

    public static boolean matchesDatePattern(String input) {
        // stub: check pattern YYYY-MM-DD
        if(input==null||input.length()!=10){return false;}
        if(input.charAt(4)!='-' || input.charAt(7)!='-'){return false;}
        int mm=Integer.parseInt(input.substring(5, 7));
        if (mm>12||mm<=0) {return false;}
        int yy=Integer.parseInt(input.substring(0, 4));
        if(yy<=0){return false;}
        int dd=Integer.parseInt(input.substring(8));
        if(dd>=32 || dd<=0){return false;}
        if(yy%4==0 && mm==2 && dd>29){return false;}
        else if(yy%4!=0 && mm==2 && dd>28){return false;}
        if(yy<7 && yy%2==0 && dd>=31){return false;}
        if(yy>7 && yy%2!=0 && dd>=31){return false;}
        return true;
        
    }
}
