public class LinearEquation {

    int x1;
    int x2;
    int y1;
    int y2;
    public LinearEquation(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public double distance() {
        if (slope() == 0.0) {
            return 1;
        } else {
            return roundedToHundredth(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
        }
    }
    public double slope() {
        return roundedToHundredth((double) (y2 - y1) / (x2 - x1));
    }
    public double yIntercept() {
        return roundedToHundredth(slope() * (x1 * -1)) + y1;
    }
    public String equation() {
        if (y2 == y1) {
            return "y = " + yIntercept();
        } else {
            return ("y = " + (y2 - y1) + "/" + (x2 - x1) + "x + " + yIntercept());
        }
    }
    public String coordinateForX(double x) {
        return "(" + x + ", " + (slope() * x + yIntercept()) + ")";
    }
    public String lineInfo() {
        if (x1 == x2) {
            return "Cannot have the same x values";
        } else {
            return "The two points are: (" + x1 + ", " + y1 + ") and (" + x2 + ", " + y2 + ") \nThe equation of the line between these two points is: " + equation() + "\nThe y-intercept of this line is: " + yIntercept() + "\nThe slope of this line is: " + slope() + "\nThe distance between these points is " + distance();
        }
    }
    private double roundedToHundredth(double toRound) {
        return Math.round(toRound * 100) / 100.0;
    }
}