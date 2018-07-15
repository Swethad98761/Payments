package fact;

public class Classify {
    public static Payment getPayment(String Mode)
    {
        if("creditcard".equalsIgnoreCase(Mode))
            return new Creditcard(Mode);
        else if("debitcard".equalsIgnoreCase(Mode))
           return new Debitcard(Mode);
        else if("wallet".equalsIgnoreCase(Mode))
            return new Wallets(Mode);
        else if("cash on delivery".equalsIgnoreCase(Mode))
            return new COD(Mode);
        else if("netbanking".equalsIgnoreCase(Mode))
            return new NetBanking(Mode);
        return null;

    }
}
