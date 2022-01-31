public class Printer {

    private int paper;
    private int toner;

    public Printer(int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int getPaper(){
        return this.paper;
    }

    public int getToner(){
        return this.toner;
    }

    public void print(int pages, int copies){
        int total = pages * copies;

        if (total <= this.paper && total <= this.toner){
            this.paper = this.paper - total;
            this.toner = this.toner - total;
        }



    }



}
