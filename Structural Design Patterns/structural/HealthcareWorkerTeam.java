package edu.parinya.softarchdesign.structural;

import java.util.LinkedHashSet;

public class HealthcareWorkerTeam implements HealthcareServiceable {
    private LinkedHashSet<HealthcareServiceable> members;

    HealthcareWorkerTeam() {
        this.members = new LinkedHashSet<>();
    }

    public void addMember(HealthcareServiceable member) {
        this.members.add(member);
    }

    public void removeMember(HealthcareServiceable member) {
        this.members.remove(member);
    }

    public void service() {
        for (var member : members) {
            member.service();
        }
    }

    public double getPrice() {
        double sum = 0.0;
        for (var member : members) {
            sum += member.getPrice();
        }
        return sum;
    }
}