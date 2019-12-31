package subject;

import observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class RebellionCommand implements Subject {

    private List<Observer> rebelAlliance = new ArrayList<Observer>();

    public void pledgeAllegiance(Observer rebel) {
        System.out.println(rebel.getName() + " pledging alliance to the rebellion");
        this.rebelAlliance.add(rebel);
    }

    public void goRogue(Observer rogueRebel) {
        System.out.println(rogueRebel.getName() + " going rogue");
        rebelAlliance.remove(rogueRebel);
    }

    public void alertMission(String mission) {
        System.out.println("Alerting rebels with new mission");
        for(Observer rebel : rebelAlliance) {
            rebel.update(mission);
        }
    }

}
