import observer.EwokTribe;
import observer.MilleniumFalcon;
import observer.Rebel;
import observer.XWingFighters;
import subject.Subject;
import subject.RebellionCommand;

public class RebellionCommandApplication {

    public static void main(String[] args) {

        Subject command = new RebellionCommand();

        Rebel ewokTribe = new EwokTribe("Ewok tribe", command);
        Rebel milleniumFalcon = new MilleniumFalcon("Millenium Falcon", command);

        command.alertMission("Attack the deathstar base on Endor");

        ewokTribe.goRogue();

        Rebel xWingFighters = new XWingFighters("X-Wing Fighters", command);

        command.alertMission("Attack the deathstar");

    }

}
