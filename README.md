# Rebellion Command

A small Star Wars inspired programme to cement my understanding of the **observer** pattern. 

> The observer pattern defines a one-to-many dependency between objects to that when one object 
changes state, all of its dependents are notified and updated automatically.

In my example, the Rebellion Command is the "subject" which pushes out new missions to Rebels or "observers"
who act according to the Command instructions. To subsscribe to the RebellionCommand, rebels "pledgeAllegience()"; to unsubscribe, rebels "goRogue()".

## Run

```
mvn clean install
java -jar target/rebellion.command-1.0-SNAPSHOT.jar
```

## Example output

```java
Subject command = new RebellionCommand();

Rebel ewokTribe = new EwokTribe("Ewok tribe", command);
// Ewok tribe pledging alliance to the rebellion

Rebel milleniumFalcon = new MilleniumFalcon("Millenium Falcon", command);
// Millenium Falcon pledging alliance to the rebellion

command.alertMission("Attack the deathstar base on Endor");
// Alerting rebels with new mission
// Ewoks carrying out new mission: Attack the deathstar base on Endor
// Millenium Falcon carrying out new mission: Attack the deathstar base on Endor

ewokTribe.goRogue();
// Ewok tribe going rogue

Rebel xWingFighters = new XWingFighters("X-Wing Fighters", command);
// X-Wing Fighters pledging alliance to the rebellion

command.alertMission("Attack the deathstar");
// Millenium Falcon carrying out new mission: Attack the deathstar
// X-Wing fighters carrying out new mission: Attack the deathstar
```

## About the Observer Pattern

The observer pattern lets us achieve loose coupling between dependent classes, as they both implement simple interfaces. 
Rebellion Command only needs to know that a Rebel implements Observer and therefore has an update and getName method. Rebels only 
need to know that Rebellion Command implements Subject and therefore includes methods to subscribe (pledgeAllegiance) and 
unsubscribe (goRogue). This means that changes to Rebellion Command should not impact a Rebel, and vice versa. 

How does this help us react to change? Thinking about the main potential areas of change:

##### A new Rebel wants to subscribe

To add a new Rebel, we just need to:
1. extend Rebel
2. call super() in the constructor
3. override update() to carry out the rebel's particular implementation of the new mission 

The new Rebel can easily subscribe or unsubscribe to the RebellionCommand at runtime and act according to 
mission instructions. No change to RebellionCommand is required. 

##### A Rebel needs to behave differently based on instructions from RebellionCommand

Just need to change the update method in the Rebel's class. Based on my current implementation, this has to be done per 
Rebel subclass, however if Rebels had common ways of behaving, these behaviours could be extracted into a behaviour class to DRY 
out the code (prefer composition over inheritance).

##### RebellionCommand needs to change how it creates instructions

Just need to change the RebellionCommand class.

##### A Rebel wants to subscribe to more than one Command

A more fundamental change, would need to change Rebel class and update method in Rebel subclasses, as well as creating new Command.
This needs more thought in terms of the overall design.

## One other thing

Of course the Ewoks didn't go rogue during the death star base attack on Endor, but for the sake of the exercise...


