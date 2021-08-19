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

        //Perimeter of Square
        @DisplayName("Perimeter of Square with Positive side")
        @Test
        void toImplementPerimeterOfSquareWithPositiveSides() {
            SquareAndRectangleMain object = new SquareAndRectangleMain(10);
            assertEquals(40, object.perimeterOfSquare());
        }

        @DisplayName("Perimeter of Square with Negative side")
        @Test
        void toImplementPerimeterOfSquareWithNegativeSides() {
            SquareAndRectangleMain object = new SquareAndRectangleMain(-10);
            assertEquals(-40, object.perimeterOfSquare());
        }


    }

    @Nested
    public class rectangleOperations {
        @DisplayName("Area of Rectangle with Positive Dimensions")
        @Test
        void toImplementAreaOfRectangleWithPositiveDimensions() {
            SquareAndRectangleMain object = new SquareAndRectangleMain(4, 5);
            assertEquals(20, object.areaOfRectangle());
        }

        @DisplayName("Area of Rectangle with Negative Dimensions")
        @Test
        void toImplementAreaOfRectangleWithNegativeDimensions() {
            SquareAndRectangleMain object = new SquareAndRectangleMain(-4, -5);
            assertEquals(20, object.areaOfRectangle());
        }

        @DisplayName("Area of Rectangle with Positive Length and Negative Width")
        @Test
        void toImplementAreaOfRectangleWithPositiveLengthAndNegativeWidth() {
            SquareAndRectangleMain object = new SquareAndRectangleMain(4, -5);
            assertEquals(-20, object.areaOfRectangle());
        }

        @DisplayName("Area of Rectangle with Negative Length and Positive Width")
        @Test
        void toImplementAreaOfRectangleWithNegativeLengthAndPositiveWidth() {
            SquareAndRectangleMain object = new SquareAndRectangleMain(-4, 5);
            assertEquals(-20, object.areaOfRectangle());
        }


    }
}
