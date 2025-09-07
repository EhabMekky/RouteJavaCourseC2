package dayFour;

//class => blueprint, container.
public class Rectangle {
    private double length; //field
    private double width; //field

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        if(width>0)
            this.width=width;
        else
            System.out.println("Width must be positive");
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        if(length>0)
            this.length=length;
        else
            System.out.println("Length must be positive");
    }

    public double calculateArea()
    {
        return length*width;
    }
}
