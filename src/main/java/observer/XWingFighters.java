package observer;

import subject.Subject;

public class XWingFighters extends Rebel {

    public XWingFighters(String name, Subject command) {
        super(name, command);
    }

    @Override
    public void update(String mission) {
        setMission(mission);
        System.out.println("X-Wing fighters carrying out new mission: " + getMission());
    }

}
