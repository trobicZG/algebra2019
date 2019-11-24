package gym;

import gym.constants.MainMenuOptionsConstants;
import gym.constants.MembersMenuOptionsConstants;
import gym.constants.OfficesMenuOptionsConstants;
import gym.screensUtil.MainMenuScreenUtil;
import gym.screensUtil.MembersMenuScreenUtil;
import gym.screensUtil.OfficesMenuScreenUtil;
import gym.service.MembersService;
import gym.service.OfficeService;

import java.io.IOException;
import java.util.Scanner;

import static gym.screensUtil.AllMenusScreenUtil.showMenu;
import static gym.util.ValidationUtil.isValidInput;

public class Application {

    private static final OfficeService officeService = new OfficeService();
    private static final MembersService membersService = new MembersService();

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        while (true) {
            System.out.println("Choose an option: ");
            showMenu(MainMenuScreenUtil.getAllowedOptions());
            String input = scanner.next();

            if (!(isValidInput(input, MainMenuScreenUtil.getAllowedOptions()))) {
                continue;
            }

            Integer mainMenuOption = Integer.parseInt(input);
            if (mainMenuOption == MainMenuOptionsConstants.EXIT_CODE) {
                break;
            }

            if (mainMenuOption == MainMenuOptionsConstants.OFFICES_CODE) {
                while (true) {
                    System.out.println("Offices options:");
                    showMenu(OfficesMenuScreenUtil.getAllowedOptions());
                    input = scanner.next();

                    if (!isValidInput(input, OfficesMenuScreenUtil.getAllowedOptions())) {
                        continue;
                    }

                    int officesOption = Integer.parseInt(input);

                    if (officesOption == OfficesMenuOptionsConstants.NEW_OFFICE_CODE) {
                        officeService.addNewOffice();
                        break;
                    }

                    if (officesOption == OfficesMenuOptionsConstants.SHOW_ALL_OFFICES) {
                        officeService.showAllOffices();
                        break;
                    }
                }
            }

            if (mainMenuOption == MainMenuOptionsConstants.MEMBERS_CODE) {
                while (true) {
                    System.out.println("Members options:");
                    showMenu(MembersMenuScreenUtil.getAllowedOptions());

                    input = scanner.next();
                    if (!isValidInput(input, MembersMenuScreenUtil.getAllowedOptions())) {
                        continue;
                    }

                    int membersOption = Integer.parseInt(input);

                    if (membersOption == MembersMenuOptionsConstants.NEW_MEMBER_CODE) {
                        membersService.addNewMember();
                        break;
                    }

                    if (membersOption == MembersMenuOptionsConstants.SHOW_ALL_MEMBERS_CODE) {
                        membersService.showAllMembers();
                        break;
                    }
                }
            }
        }

        System.out.println("Application shutting down.");
    }


}
