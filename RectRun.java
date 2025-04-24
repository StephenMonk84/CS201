public class RectRun{
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(5, 10);
        System.out.println("Area of r1: " + r1.getArea());
        System.out.println("Perimeter of r1: " + r1.getPerimeter());
        System.out.println("Area of r2: " + r2.getArea());
        System.out.println("Perimeter of r2: " + r2.getPerimeter());
    }    
}

public class Rectangle{
    
    int width;
    int height;    
    /**Default Constructor */
    Rectangle(){
        width = 1;
        height = 1;
    }
    /**Parameterized Constructor */    
    Rectangle(int w, int h){
        width = w;
        height = h;
    }
    int getArea(){
        return width * height;
    }
    int getPerimeter(){
        return 2 * (width + height);
    }

    void setWidth(int w){
        width = w;
    }
    void setHeight(int h){
        height = h;
    }
}