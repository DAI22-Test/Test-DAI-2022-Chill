package ch.heigvd.api.chill.domain.arubinst;

import ch.heigvd.api.chill.domain.Bartender;
import ch.heigvd.api.chill.protocol.OrderRequest;
import ch.heigvd.api.chill.protocol.OrderResponse;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PolarTest {

    @Test
    void thePriceAndNameForPolarShouldBeCorrect() {
        Polar beer = new Polar();
        assertEquals(beer.getName(), Polar.NAME);
        assertEquals(beer.getPrice(), Polar.PRICE);
    }

    @Test
    void aBartenderShouldAcceptAnOrderForPolar() {
        Bartender jane = new Bartender();
        String productName = "ch.heigvd.api.chill.domain.arubinst.Polar";
        OrderRequest request = new OrderRequest(3, productName);
        OrderResponse response = jane.order(request);
        BigDecimal expectedTotalPrice = Polar.PRICE.multiply(new BigDecimal(3));
        assertEquals(expectedTotalPrice, response.getTotalPrice());
    }

}
