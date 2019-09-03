//Superklassen
public class Machine {

    //fields
    private boolean isOn;

    public void turnOn() {
        //tænder for maskinen
        this.isOn = true;
    }

    public void turnOff() {
        //slukker for maskinen
        this.isOn = false;
    }

    public void makeSound() {
        System.out.println("");
    }

    @Override
    public String toString() {

        if (this.isOn) {
            return "Machine is on.";
        } else {
            return "Machine is off.";
        }
    }
}
