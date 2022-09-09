// Class used to obtain the area of the square, triangle and rectangle

interface Shape {
    public int getArea(int lengthA, int lengthB) throws InvalidStatementException;
}

// Class to calculate the area of the square
class Square implements Shape {
    public int getArea(int lengthA, int lengthB) throws InvalidStatementException{
        // Condition to validate if each parameter is different between them and different from zero
       if (lengthA != lengthB && lengthA != 0 && lengthB != 0){
        throw new InvalidStatementException("The given values are not part of a square");
        // Condition to validate if values are higher than zero
      } else if (lengthA <= 0 || lengthB <= 0){
        throw new InvalidStatementException("Zero is not an allowed value");
      }
        int area = lengthA * lengthB;
        return area;
    }
}

// Class to calculate the area of the triangle
class Triangle implements Shape {
    public int getArea(int lengthA, int lengthB) throws InvalidStatementException {
    // Condition to validate if values are higher than zero
        if (lengthA <= 0 || lengthB <= 0){ 
            throw new InvalidStatementException("Zero is not an allowed value");
        }
        int area = (lengthA * lengthB) / 2;
        return area;
    }
}

// Class to calculate the area of the rectangle
class Rectangle implements Shape {
    public int getArea(int lengthA, int lengthB) throws InvalidStatementException {
    // Condition to validate if values are higher than zero
        if (lengthA <= 0 || lengthB <= 0){
            throw new InvalidStatementException("Zero is not an allowed value");
        }
            int area = lengthA * lengthB;
            return area;
    }
}

// Class main
public class Main {
    public static void main(String[] args) {
        Shape sqrt = new Square();
        Shape trngl = new Triangle();
        Shape rect = new Rectangle();
        // Exception block for the square method
        try {
            int areaSquare = sqrt.getArea(2,7);
            System.out.println("The area of the square is " + areaSquare);
        } catch (InvalidStatementException ex) {
            System.out.println("The square method caught an exception");
            System.out.println(ex);
        } 
        // Exception block for the triangle method
        try {
            int areaTriangle = trngl.getArea(5,7);
            System.out.println("The area of the triangle is " + areaTriangle);
        } catch (InvalidStatementException ex) {
            System.out.println("The triangle method caught an exception");
            System.out.println(ex);
        }
        // Exception block for the rectangle method
        try {
            int areaRectangle = rect.getArea(5,0);
            System.out.println("The area of the rectangle is " + areaRectangle);
        } catch (InvalidStatementException ex) {
            System.out.println("The triangle method caught an exception");
            System.out.println(ex); 
        }
    }
}


