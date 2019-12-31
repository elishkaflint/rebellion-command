package observer;

import subject.Subject;

public class Rebel implements Observer {

    private Subject command;
    private String name;
    private String mission;

    public Rebel(String name, Subject command) {
        setName(name);
        this.command = command;
        pledgeAllegiance();
    }

    public void update(String mission) {
        setMission(mission);
    }

    public void goRogue() {
        this.command.goRogue(this);
    }

    public void pledgeAllegiance() {
        this.command.pledgeAllegiance(this);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        this.name = name;
    }

    String getMission() {
        return this.mission;
    }

    void setMission(String mission) {
        this.mission = mission;
    }

}
