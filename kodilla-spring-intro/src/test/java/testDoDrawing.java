import com.kodilla.springe.intro.shape.Circle;
import com.kodilla.springe.intro.shape.Drawer;
import com.kodilla.springe.intro.shape.Triangle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testDoDrawing {

    @Test
    void testDoDrawingTriangle() {
        //Given
        Triangle triangle = new Triangle();
        //When
        Drawer drawer = new Drawer(triangle);
        String result = drawer.doDrawing();
        //Then
        assertEquals(result, "This is Triangle");
    }

    @Test
    void testDoDrawingCircle() {
        //Given
        Circle circle = new Circle();
        //When
        Drawer drawer = new Drawer(circle);
        String result = drawer.doDrawing();
        //Then
        assertEquals(result, "This is Circle");
    }
}
