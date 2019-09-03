public class Printer extends Machine {

    //fields
    private PaperTray paperTray;

    public Printer() {
        paperTray = new PaperTray(); // composition
        paperTray.load(5);
    }

    public void print(String text, int amount) {

        for (int i = 0; i < amount; i++) {
            System.out.print(text);
            paperTray.usePaper();
            System.out.println(paperTray.getPaper());
        }
    }

}
