import java.math.BigDecimal;
import java.math.RoundingMode;

class Multiplication implements Operation {
    @Override
    public BigDecimal perform(BigDecimal a, BigDecimal b) {
        return a.multiply(b).setScale(5, RoundingMode.HALF_UP);
    }
}