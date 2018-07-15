package fact;

public abstract class Payment {
    public abstract String getMode();
    @Override
    public String toString()
    {
     return "Payment is done by "+this.getMode();
    }
}
