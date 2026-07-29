package yogaharis.solution.array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestTimeToBuyAndSellStockTest {

    private BestTimeToBuyAndSellStock bestTimeToBuyAndSellStock;

    @BeforeEach
    void setUp() {
        bestTimeToBuyAndSellStock = new BestTimeToBuyAndSellStock();
    }

    @Test
    void test1() {
        int maxProfit = bestTimeToBuyAndSellStock.maxProfit(new int[]{7, 1, 5, 3, 6, 4});

        assertEquals(5, maxProfit);
    }

    @Test
    void test2() {
        int maxProfit = bestTimeToBuyAndSellStock.maxProfit(new int[]{7,6,4,3,1});

        assertEquals(0, maxProfit);
    }
}