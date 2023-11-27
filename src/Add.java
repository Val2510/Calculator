import java.math.BigDecimal;

public class Add implements Operation {
    @Override
    public BigDecimal perform(BigDecimal a, BigDecimal b) {
        return a.add(b);
    }
}
