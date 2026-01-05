public class StartSquare {
    public static void main(String[] args) {
        Square sq1 = new Square(2,2,2);
        System.out.println(sq1);
        sq1.setPoint(7,6);
        System.out.println(sq1);
//        sq1.setSideLength(-29);
        sq1.setSideLength(29);
        System.out.println(sq1);
        sq1.setState(2,6,10);
        System.out.println(sq1);
    }
}
