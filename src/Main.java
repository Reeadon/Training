public class Main {

    public static void main (String [] args) {
        //Arv

        Machine m = new Machine();
        Printer p = new Printer();

        System.out.println(m);
        m.turnOn();
        System.out.println(m);
        m.turnOff();
        System.out.println(m);

        p.turnOn();
        p.print("papir = " , 5);
        p.turnOff();

    }

}
