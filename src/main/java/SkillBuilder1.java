import java.util.Scanner;

/**
 * Skill Builder 1
 *
 * @author (You)
 * @version (2.1, 2.2)
 */
public class SkillBuilder1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //TODO : Replace this comment with your code
        String userString;
        userString = input.nextLine();
        float userDouble;
        double temp;
        //userDouble = input.nextDouble();
        userDouble = input.nextFloat();
        temp = (double)userDouble;

        System.out.println("You're Jane's friend!");
        System.out.println("\"What's your name?\" ");
        //System.out.println(userString);
        System.out.println("Enter a floating-point number : ");

        System.out.println("Well" +" " + userString + " "+ "the spice value resulted in" + " " + temp);
        float var = userDouble;

        System.out.println("And the converted value is" + " " + userDouble );

    }
    public static void calcWallPaint() {
        Scanner input = new Scanner(System.in);
        double wallHeight;
        double wallWidth;
        double wallArea;
        double gallonsPaintNeeded;
        int cansNeeded;

        final double squareFeetPerGallons = 350.0;
        final double gallonsPerCan = 1.0;

        // Prompt user to input wall's width
        System.out.println("Enter wall height (feet):");
        wallHeight = input.nextDouble();

        // Prompt user to input wall's width
        System.out.println("Enter wall width (feet):");
        wallWidth = input.nextDouble();

        // TODO: Calculate and output the wall's area
        wallArea = wallHeight*wallWidth;
        System.out.println("Wall area :" + " " + (int)wallArea + " " + "square feet");
        // TODO: Calculate and output the amount of paint in gallons needed to paint the wall
        gallonsPaintNeeded = (wallArea/squareFeetPerGallons);
        System.out.println("Paint needed: " +Math.ceil(gallonsPaintNeeded) +" gallons");




        // TODO: Calculate and output the number of 1 gallon cans needed to paint the wall, rounded up to nearest integer

        cansNeeded = (int)Math.ceil(gallonsPaintNeeded/gallonsPerCan);
        System.out.println("Cans needed: "+" "+(int)Math.ceil(cansNeeded) +" " + "can(s)");
    }
}
