package subject;

import observer.Observer;

public interface Subject {

    void pledgeAllegiance(Observer rebel);

    void goRogue(Observer rebel);

    void alertMission(String mission);

}
