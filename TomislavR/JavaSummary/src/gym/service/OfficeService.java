package gym.service;

import gym.constants.ApplicationConstants;
import gym.mapper.OfficeMapper;
import gym.model.Office;
import gym.repository.Repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class OfficeService {

    public void addNewOffice() throws IOException {
        Scanner scanner = new Scanner(System.in);
        Office office = new Office();

        System.out.println("City: ");
        office.setCity(scanner.nextLine());

        System.out.println("Address: ");
        office.setAddress(scanner.nextLine());

        System.out.println("Working hours: ");
        office.setWorkingHours(scanner.nextLine());

        System.out.println("Contact phone: ");
        office.setContactNumber(scanner.nextLine());

        office.setId(Repository.getLatestId(ApplicationConstants.OFFICES_FILE_NAME) + 1);

        Repository.addNew(ApplicationConstants.OFFICES_FILE_NAME, office.toString());
    }

    public void showAllOffices() throws IOException {
        System.out.println("All offices:");
        ArrayList<String> allRows = Repository.getAllRows(ApplicationConstants.OFFICES_FILE_NAME);
        ArrayList<Office> allOffices = new ArrayList<>();

        for (String s : allRows) {
            allOffices.add(OfficeMapper.toObject(s));
        }

        for (Office o : allOffices) {
            System.out.println("OFFICE: " + o.toString());
        }
    }
}
