import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TripManager {
    private static Scanner stdin = new Scanner(System.in);
    private static Stop stops = new Stop();
    private static Stop trips = new Stop();
    private static String fileName = null;

    public static void printMenu () {
        System.out.println(
            "(1) Create a New Trip File\n" +
            "(2) Save Trip File\n" +
            "(3) Load a Trip File\n" +
            "(4) View List\n" +
            "(5) Insert New Stop\n" +
            "(6) Remove Stop\n" +
            "(7) Quit"
        );
    }

    public static Location insertNewStop() {
        Location newLocation = null;
        try {
            System.out.println("Please enter city name, lat deg, lat min, long deg, long min, lat dir,and long dir each separated by the enter key");
            newLocation = new Location(stdin.next(), stdin.nextDouble(), stdin.nextDouble(), stdin.nextDouble(), stdin.nextDouble(), stdin.next().charAt(0), stdin.next().charAt(0));
        } catch (Exception Ex) {
            System.out.println("Input value was not correct.");
            newLocation = insertNewStop();
        }
        if(newLocation != null) {
            stops.insert(newLocation);
        }
        return newLocation;
    }

    public static void saveNewFile() {
        try {
            System.out.print("Enter the file name without the extension:\t");
            String newFileName = stdin.next();
            File f = new File(newFileName + ".txt");
            stdin.close();
            Scanner stdin = new Scanner(f);
            PrintWriter out = new PrintWriter(f);
            out.print(stops);
            stdin.close();
            stdin = new Scanner(System.in);
            fileName = newFileName;
        } catch(FileNotFoundException ex) {
            System.out.println("File was not found");
        } catch (Exception ex) {
            System.out.println("Something went wrong!");
        }
    }

    public static void saveFile() {
        if(fileName == null) {
            System.out.println("Your file was not previously saved. Saving new file...");
            saveNewFile();
        } else {
            try {
                File f = new File(fileName);
                stdin.close();
                Scanner stdin = new Scanner(f);
                PrintWriter out = new PrintWriter(f);
                out.print(stops);
                stdin.close();
                stdin = new Scanner(System.in);
            } catch (FileNotFoundException ex) {
                System.out.println("File was not found");
            } catch (Exception ex) {
                System.out.println("Something went wrong!");
            }
        }
    }

    public static void loadFile() {
        try {
            System.out.print("Enter the file name:\t");
            String newFileName= stdin.next();
            File f = new File(newFileName);
            stdin.close();
            Scanner stdin = new Scanner(f);

            // read the file then load it to the program

            PrintWriter out = new PrintWriter(f);
            out.print(stops);
            stdin.close();
            stdin = new Scanner(System.in);
            fileName = newFileName;
        } catch(FileNotFoundException ex) {
            System.out.println("File was not found");
        } catch (Exception ex) {
            System.out.println("Something went wrong!");
        }
    }

    public static void handleMenu() {
        printMenu();
        try {
            switch(stdin.nextInt()) {
                case 1: // Create a New Trip File
                    saveFile();
                    break;
                case 2: // Save Trip File
                    saveFile();
                    break;
                case 3: // Load a Trip File
                    loadFile();
                    break;
                case 4: // View List
                    System.out.println(stops);
                    break;
                case 5: // Insert New Stop
                    insertNewStop();
                    break;
                case 6: // Remove Stop
                    System.out.println("Please enter the stop name.");
                    stops.remove(stdin.next());
                    break;
                case 7: // Quit
                    System.exit(0);
                    break;
                default:
                    break;
            }
        } catch(Exception ex) {
            System.out.println("That's not a valid option dude");
        }
    }

    public static void printTripMenu () {
        System.out.println(
            "(1) View Current Stop" +
            "(2) Append Stop to the Trip" +
            "(3) Insert Stop to the Trip" +
            "(4) Remove Stop from the Trip" +
            "(5) Save the Trip"
        );
    }

    public static void Main(String[] args) {
        while(true) {
            handleMenu();
        }
    }
}
