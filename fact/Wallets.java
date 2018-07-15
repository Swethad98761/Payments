package fact;

public class Wallets extends Payment {
    private String Mode;
    public Wallets(String Mode)
    {this.Mode=Mode;
    }
    @Override
    public String getMode()
    {
        return this.Mode;
    }
}
