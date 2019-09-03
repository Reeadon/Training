public class PaperTray {

    private int paper;

    public int getPaper() {
        return paper;
    }

    public int displayPaper(){
        return paper;
    }

    public void usePaper() {
        this.paper -= 1;


        if (this.paper == 0) {
            System.out.println("no more paper");
            load(100);
            displayPaper();

        }

    }

    public void load(int paper) {
        this.paper = paper;
    }
}
