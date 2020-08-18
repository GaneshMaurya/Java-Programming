public class Bikes {
    String bikeColor;
    
    public Bikes(String color) {
        bikeColor = color;
    }
    
    public static void main(String[] args) {
        Bikes bike = new Bikes("red");
        System.out.println(bike.bikeColor);
    }
}