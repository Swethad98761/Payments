package fact;

public class NetBanking extends Payment {
    private String Mode;
    public NetBanking(String Mode)
    {this.Mode=Mode;
    }
    @Override
    public String getMode()
    {
        return this.Mode;
    }
}
