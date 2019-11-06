package gym;

import gym.constants.MainMenuOptionsConstants;
import gym.screensUtil.MainMenu;
import gym.screensUtil.OfficesMenu;

import java.util.Scanner;

import static gym.screensUtil.AllMenus.showMenu;
import static gym.util.ValidationUtil.isValidInput;

public class Application {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {

            System.out.println("Choose an option: ");
            showMenu(MainMenu.getAllowedOptions());

            String input = scanner.next();

            if (!(isValidInput(input, MainMenu.getAllowedOptions()))) {
                continue;
            }

            Integer mainMenuOption = Integer.parseInt(input);
            if (mainMenuOption == MainMenuOptionsConstants.EXIT_CODE) {
                break;
            }

            if (mainMenuOption == MainMenuOptionsConstants.OFFICES_CODE) {
                while (true) {
                    System.out.println("Offices options:");
                    showMenu(OfficesMenu.getAllowedOptions());
                    input = scanner.next();

                    if (!isValidInput(input, OfficesMenu.getAllowedOptions())) {
                        continue;
                    }

                    int officesOption = Integer.parseInt(input);


                }
            }
        }

        System.out.println("Application shutting down.");
    }


}
