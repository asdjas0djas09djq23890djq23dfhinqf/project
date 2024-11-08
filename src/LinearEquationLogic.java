import java.util.Scanner;

public class LinearEquationLogic {

    private LinearEquation linearequation;
    Scanner scanner = new Scanner(System.in);

    public LinearEquationLogic() {
        linearequation = null;
    }
    public void start() {
        System.out.println("Welcome to the linear equation calculator!");
        enterCoordinates();
    }
    public void enterCoordinates() {
        System.out.print("Enter coordinate 1: ");
        String coords1 = scanner.nextLine();
        System.out.print("Enter coordinate 2: ");
        String coords2 = scanner.nextLine();
        LinearEquation linearequation = new LinearEquation(parseX(coords1), parseY(coords1), parseX(coords2), parseY(coords2));
        System.out.println(linearequation.lineInfo());
        if (parseX(coords1) == parseX(coords2)) {
            enterCoordinates();
        } else {
            System.out.print("\nEnter a value for x: " );
            System.out.println("\nThe point on the line is " + linearequation.coordinateForX(scanner.nextDouble()));
            newCoordinates();
        }
    }
    public int parseX(String coordinates) {
        return Integer.parseInt(coordinates.substring(1, coordinates.indexOf(",")));
    }

    public int parseY(String coordinates) {
        return Integer.parseInt(coordinates.substring((coordinates.indexOf(" ") + 1), coordinates.indexOf(")")));
    }
    public void newCoordinates() {
        scanner.nextLine();
        System.out.print("\nWould you like to enter another pair of coordinates? y/n: ");
        String yesorno = scanner.nextLine();
        if (yesorno.equals("y")) {
            enterCoordinates();
        }
    }
}