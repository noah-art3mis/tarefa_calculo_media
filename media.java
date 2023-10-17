
/**
 * media
 */
public class media {

    public static double fazMedia(double a, double b, double c, double d) {
        double r = a + b + c + d;
        r = r / 4;
        return r;
    }

    public static void main(String[] args) {
        double r = fazMedia(1.0, 2.0, 3.0, 4.0);
        System.out.println(r);

    }
}