public class Start {
    public static void main(String[] args) {
        Point point_1 = new Point(1,3);
        Point point_2 = new Point(1,3);
        Point point_3 = new Point(5,8);

        System.out.println(point_1);
        System.out.println(point_2);
        System.out.println(point_3);

        System.out.println(point_1 == point_2);
        System.out.println(point_1 == point_3);
        System.out.println(point_2 == point_3);
    }

}
