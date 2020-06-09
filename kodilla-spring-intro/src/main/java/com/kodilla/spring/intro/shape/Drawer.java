package com.kodilla.spring.intro.shape;

public class Drawer {

//    public void doDrawing() {
/**  1.  "tworzy obiekt tj. instancje bezpośrednio z klasy"
 *
 Circle circle = new Circle();
 Triangle triangle = new Triangle();

 circle.draw();
 triangle.draw();
 */

/**  2. "tworzy obiekt tj. instancje po klasie wyżej tj. kl. abstrakcyjnej po której dziedziczy "
 *
 Figure figure;

 figure = new Circle();
 figure.draw();

 figure = new Triangle();
 figure.draw();
 */

/**    "uruchamia metode z klas które zaimplementowały interfeis"

 Shape shape;

 shape = new Circle();
 shape.draw();

 shape = new Triangle();
 shape.draw();*/
//  }

//        Alicja Malok

final Shape shape;

    public Drawer(final Shape shape) {
        this.shape = shape;
    }

    public String doDrawing() {
        return shape.draw();
    }

}