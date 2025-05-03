package tudelft.discount;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DiscountApplierTest {

    @Test
    public void testApplyDiscounts() {
        // Arrange
        Product p1 = new Product("TV", 100.0, "HOME");
        Product p2 = new Product("Laptop", 200.0, "BUSINESS");
        List<Product> products = Arrays.asList(p1, p2);

        ProductDao mockDao = Mockito.mock(ProductDao.class);
        Mockito.when(mockDao.all()).thenReturn(products);

        DiscountApplier applier = new DiscountApplier(mockDao);

        applier.setNewPrices();

        assertEquals(90.0, p1.getPrice(), 0.001);
        assertEquals(220.0, p2.getPrice(), 0.001);
    }
}