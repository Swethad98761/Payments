package fact;

public class Debitcard extends Payment {
    private String Mode;
    public Debitcard(String Mode)
    {this.Mode=Mode;
    }
    @Override
    public String getMode()
    {
        return this.Mode;
    }
}
