import java.io.IOException;
import java.util.*;

public class GymApplication {

    private static final Scanner scanner = new Scanner(System.in);
    private static Map<Integer, String> allowedOptionsMap = new HashMap<>();
    private static Map<Integer, String> allowedOptions2Map = new HashMap<>();

    private static final int EXIT_APPLICATION_CODE = 0;
    private static final int GYM_CODE = 1;
    private static final int MEMBERS_CODE = 2;
    private static final int FEE_CODE = 3;
    private static final int EQUIPMENT_CODE = 4;
    private static final int ADD_GYM_CODE = 1;
    private static final int SHOW_ALL_GYMS_CODE = 2;

    public static void main(String[] args) throws IOException {
        populateAllowedOptions();
        populateAllowedOptions2();

        while (true) {
            System.out.println(" Main menu :");
            showMainMenu();
            try {
                int option = scanner.nextInt();

                if (!allowedOptionsMap.containsKey(option)) {
                    throw new InvalidOptionException(option);
                }

                if (option == EXIT_APPLICATION_CODE) {
                    break;
                }

                if (option == GYM_CODE) {
                    while (true) {
                        System.out.println(" Gym menu :");
                        showGymMenu();
                        option = scanner.nextInt();

                        if (option == ADD_GYM_CODE) {
                            Gym gym=Gym.fromConsole();
                            ReadWriteUtil.saveToTxt(gym);
                        }

                        if (option == SHOW_ALL_GYMS_CODE) {
                            ArrayList<Gym> students = ReadWriteUtil.toStudentsList();
                            System.out.println("All students: " + students);
                        }
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("Invalid option");
                scanner.next();
            } catch (IllegalArgumentException | InvalidOptionException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private static void showMainMenu() {
        for (int i = 0; i < allowedOptionsMap.size(); i++) {
            System.out.println(i + " -> " + allowedOptionsMap.get(i));
        }
    }

    private static void showGymMenu() {
        for (int i = 1; i <= allowedOptions2Map.size(); i++) {
            System.out.println(i + " -> " + allowedOptions2Map.get(i));
        }
    }

    private static void populateAllowedOptions() {
        allowedOptionsMap.put(EXIT_APPLICATION_CODE, "Exit application.");
        allowedOptionsMap.put(GYM_CODE, "Gym.");
        allowedOptionsMap.put(MEMBERS_CODE, "Members.");
        allowedOptionsMap.put(FEE_CODE, "Fee.");
        allowedOptionsMap.put(EQUIPMENT_CODE, "Equipment.");
    }

    private static void populateAllowedOptions2() {
        allowedOptions2Map.put(ADD_GYM_CODE, "Add gym.");
        allowedOptions2Map.put(SHOW_ALL_GYMS_CODE , "Show all gyms.");
    }


}
