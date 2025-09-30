package Default_Package;

//Abstract class: cannot be instantiated, can have abstract and regular methods
abstract class GraphicObject {
 // Abstract method: no body, must be implemented by subclasses
 abstract void draw(); 
 
 // Another abstract method
 abstract void resize();

 // Regular method: can have implementation in abstract class
 void moveTo(int x, int y) {
     System.out.println("Moved to x = " + x + ", y = " + y);
 }
}

//Subclass: must provide implementations for all abstract methods
class Circle extends GraphicObject {
 @Override
 void draw() {
     System.out.println("Drawing a Circle");
 }

 @Override
 void resize() {
     System.out.println("Resizing Circle");
 }
}

//Another subclass: implements abstract methods
class Rectangle extends GraphicObject {
 @Override
 void draw() {
     System.out.println("Drawing a Rectangle");
 }

 @Override
 void resize() {
     System.out.println("Resizing Rectangle");
 }
}

//Main class to test abstraction
public class AbstractionDemo {
 public static void main(String[] args) {
     GraphicObject circle = new Circle();    // Polymorphism: parent ref to child object
     circle.draw();                          // Calls Circle's draw()
     circle.resize();                        // Calls Circle's resize()
     
     GraphicObject rectangle = new Rectangle();
     rectangle.draw();                       // Calls Rectangle's draw()
     rectangle.resize();                     // Calls Rectangle's resize()
 }
}