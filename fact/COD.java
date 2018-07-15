package fact;

public class COD extends Payment{
    private String Mode;
    public COD(String Mode)
    {this.Mode=Mode;
    }
    @Override
    public String getMode()
    {
        return this.Mode;
    }
}
