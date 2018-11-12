public class Printer {

    private int sheetsFull;
    private int sheetsLeft;
    private int tonerLeft;


    public Printer (int sheetsLeft, int sheetsFull, int tonerLeft){
        this.sheetsLeft = sheetsLeft;
        this.sheetsFull = sheetsFull;
        this.tonerLeft = tonerLeft;
    }


    public String print(int pages, int copies) {
        int required = pages * copies;
        if (this.sheetsLeft >= required && this.tonerLeft >= required) {
            int newSheetsLeft = sheetsLeft - required;
            sheetsLeft = newSheetsLeft;
            int newTonerLeft = tonerLeft - required;
            tonerLeft = newTonerLeft;
            final String format = String.format("Print successful. %s sheets of paper left and %s toner left", this.sheetsLeft, this.tonerLeft);
            return format;
        }
        final String format = String.format("Print unsuccessful, check paper (only %s sheets left) and toner (only %s left)", this.sheetsLeft, this.tonerLeft);
        return format;
    }

    public int refill(){
        sheetsLeft = sheetsFull;
        return sheetsLeft;
    }

}




