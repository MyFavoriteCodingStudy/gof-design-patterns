

import shape.Circle;
import shape.Rectangle;
import shape.Shape;

import java.util.ArrayList;
import java.util.List;

//Prototype 패턴은 [Cloneable] 인터페이스와 함께 Java에서 즉시 사용할 수 있습니다.
//모든 클래스는 이 인터페이스를 구현하여 복제할 수 있습니다.
//java.lang.Object#clone() (클래스는 java.lang.Cloneable 인터페이스를 구현해야 함)
//식별: 프로토타입은 복제 또는 복사 방법 등으로 쉽게 식별할 수 있습니다.
public class PrototypeDemo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }
    }
}
