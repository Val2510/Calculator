import java.math.BigDecimal;
import java.math.RoundingMode;

class Division implements Operation {
    @Override
    public BigDecimal perform(BigDecimal a, BigDecimal b) {
        if (b.equals(BigDecimal.ZERO)) {
            throw new IllegalArgumentException("Делить на ноль нельзя");
        }
        return a.divide(b, 5, RoundingMode.HALF_UP);
    }
}
