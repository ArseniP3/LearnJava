import java.math.BigDecimal;

public class HighPrecisionCalculator {

    int sum (int intNumA, int intNumB){
        int result;
        return result = intNumA +intNumB;
    }

    double sum (double dubNumA, double dubNumB){
        double result;
        return result = dubNumA + dubNumB;
    }

    BigDecimal sum (BigDecimal decNumA, BigDecimal decNumB){
        BigDecimal result;
        return result = decNumA.add(decNumB);
    }

    public static void main(String[] args) {
        int intNumA = 49;
        int intNumB = 32;
        double dubNumA = 12.13;
        double dubNumB = 15.34;

        BigDecimal decNumA = new BigDecimal(12554545.854646468497654987664);
        BigDecimal decNumB = new BigDecimal(5154.946576579479815567657);

        int inSum;
        double dubSum;
        BigDecimal decSum;

        HighPrecisionCalculator peregr = new HighPrecisionCalculator();

        inSum = peregr.sum(intNumA, intNumB);
        System.out.println("Сумма сложения " + intNumA + " и " + intNumB + " равна: " + inSum);

        dubSum = peregr.sum(dubNumA, dubNumB);
        System.out.println("Сумма сложения " + dubNumA + " и " + dubNumB + " равна: " + dubSum);

        decSum = peregr.sum(decNumA, decNumB);
        System.out.println("Сумма сложения " + decNumA + " и " + decNumB + " равна: " + decSum);
    }
}
