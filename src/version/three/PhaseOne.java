package version.three;

import java.text.MessageFormat;

public class PhaseOne {
    public static final String GREEN_BOLD_BRIGHT = "\033[1;92m";
    public static final String RED_BOLD_BRIGHT = "\033[1;91m";
    public static final String RESET = "\033[0m";
 //MoreOnDegrees

    public void DegreeToGradian(int degree) throws InterruptedException {
        System.out.println("");
        double deg = degree * 200;
        double res = deg / 180;
        String out3 = GREEN_BOLD_BRIGHT + degree + RESET;
        String gradian = GREEN_BOLD_BRIGHT + res + RESET;
        String out1 = RED_BOLD_BRIGHT + "::Degree:: " + RESET;
        String out2 = RED_BOLD_BRIGHT + " ::Gradian[g]:: " + RESET;
        String last = MessageFormat.format("{0}{1}{2}{3}",out1, out3, out2, gradian);
        System.out.print(last);
        Thread.sleep(2000);
    }
    public void DegreeToMilliradian() {

    }
    public void DegreeToMinuteOfArc() {

    }
    /** public void DegreeToRadian() {

    }
    */
    public void DegreeToSecondOfArc() {

    }
}

