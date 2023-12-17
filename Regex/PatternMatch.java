import java.util.regex.*;

public class PatternMatch {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("CS[456]\\d{3}");
        // The above pattern matches CS4xx, CS5xx and CS6xx where x is a digit
        // the double backslash is needed to escape the backslash in the string

        Matcher m = p.matcher("CS4999 is a course");

        System.out.println(m.find());
        // The above matches the first occurence of the pattern

        System.out.println(m.matches());
        // The above matches the entire string
    }
}
