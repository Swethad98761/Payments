package fact;

public class Creditcard extends Payment{
    private String Mode;
    public Creditcard(String Mode)
    {this.Mode=Mode;
    }
    @Override
    public String getMode()
    {
        return this.Mode;
    }
}
