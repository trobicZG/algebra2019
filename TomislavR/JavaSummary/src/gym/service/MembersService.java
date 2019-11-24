package gym.service;

import gym.constants.ApplicationConstants;
import gym.mapper.MembersMapper;
import gym.model.Member;
import gym.repository.Repository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class MembersService {

    public void addNewMember() throws IOException {
        Member member = new Member();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first name:");
        member.setFirstName(scanner.nextLine());

        System.out.println("Enter last name:");
        member.setLastName(scanner.nextLine());

        System.out.println("Enter oib");
        member.setOib(scanner.next());

        member.setId(Repository.getLatestId(ApplicationConstants.MEMBERS_FILE_NAME));

        Repository.addNew(ApplicationConstants.MEMBERS_FILE_NAME, member.toString());
    }

    public void showAllMembers() throws IOException {
        System.out.println("All members:");
        ArrayList<String> allRows = Repository.getAllRows(ApplicationConstants.MEMBERS_FILE_NAME);
        ArrayList<Member> allMembers = new ArrayList<>();

        for (String s : allRows) {
            allMembers.add(MembersMapper.toObject(s));
        }

        for (Member o : allMembers) {
            System.out.println("MEMBERS: " + o.toString());
        }
    }

}
