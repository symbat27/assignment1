package project;

import java.util.ArrayList;
import java.util.List;

public class School {
    private final List<Person> members;

    public School() {
        members = new ArrayList<>();
    }

    public void addMember(Person member) {
        members.add(member);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Person member : members) {
            result.append(member.toString()).append("\n");
        }
        return result.toString();
    }
}
