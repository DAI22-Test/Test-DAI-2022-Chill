package ch.heigvd.api.chill.domain.arubinst;

import ch.heigvd.api.chill.domain.IProduct;

import java.math.BigDecimal;

public class Polar implements IProduct {

  public final static String NAME = "Polar";
  public final static BigDecimal PRICE = new BigDecimal(8.5);

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public BigDecimal getPrice() {
    return PRICE;
  }
}
