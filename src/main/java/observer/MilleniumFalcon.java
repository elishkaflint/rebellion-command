package observer;

import subject.Subject;

public class MilleniumFalcon extends Rebel {

    public MilleniumFalcon(String name, Subject command) {
        super(name, command);
    }

    @Override
    public void update(String mission) {
        setMission(mission);
        System.out.println("Millenium Falcon carrying out new mission: " + getMission());
    }

}
