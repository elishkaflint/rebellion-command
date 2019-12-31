package observer;

import subject.Subject;

public class EwokTribe extends Rebel {

    public EwokTribe(String name, Subject command) {
        super(name, command);
    }

    @Override
    public void update(String mission) {
        setMission(mission);
        System.out.println("Ewoks carrying out new mission: " + getMission());
    }

}
