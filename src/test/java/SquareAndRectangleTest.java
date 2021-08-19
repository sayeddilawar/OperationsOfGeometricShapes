import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SquareAndRectangleTest {
    @Nested
    public class squareOperations {
        @DisplayName("Area of Square with Positive Sides")
        @Test
        void toImplementAreaOfSquareWithPositiveSides() {
            SquareAndRectangleMain object = new SquareAndRectangleMain(5);
            assertEquals(25, object.areaOfSquare());
        }

        @DisplayName("Area of Square with Positive Sides")
        @Test
        void toImplementAreaOfSquareWithNegativeSides() {
            SquareAndRectangleMain object = new SquareAndRectangleMain(-5);
            assertEquals(25, object.areaOfSquare());
        }

        @DisplayName("Area of Square with Positive Decimal side")
        @Test
        void toImplementAreaOfSquareWithPositiveDecimalSides() {
            SquareAndRectangleMain object = new SquareAndRectangleMain(5.5);
            assertEquals(30.25, object.areaOfSquare());
        }

        @DisplayName("Area of Square with Negative Decimal side")
        @Test
        void toImplementAreaOfSquareWithNegativeDecimalSides() {
            SquareAndRectangleMain object = new SquareAndRectangleMain(-5.5);
            assertEquals(30.25, object.areaOfSquare());
        }
    }
}
