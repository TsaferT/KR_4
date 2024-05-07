public class IsoscelesTrapezoid {
    double x1, y1;
    double x2, y2;
    double x3, y3;
    double x4, y4;
    public IsoscelesTrapezoid(double x1, double y1, double x2, double y2,
                              double x3, double y3, double x4, double y4)throws Exception {
        if (x1 < 0 && x2 < 0 && x3 < 0 && x4 < 0 && y1 < 0 && y2 < 0 && y3 < 0 && y4 < 0) {
            throw new Exception("Неправильно");
        }else{
            this.x1 = x1;
            this.y1 = y1;
            this.x2 = x2;
            this.y2 = y2;
            this.x3 = x3;
            this.y3 = y3;
            this.x4 = x4;
            this.y4 = y4;
        }
    }
    public boolean isIsoscelesTrapezoid() {
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // Длина первой стороны
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)); // Длина второй стороны
        double side3 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2)); // Длина третьей стороны
        double side4 = Math.sqrt(Math.pow(x1 - x4, 2) + Math.pow(y1 - y4, 2)); // Длина четвертой стороны

        return (side1 == side3);
    }
    public double calculPerimeter() {
        double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)); // Длина первой стороны
        double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2)); // Длина второй стороны
        double side3 = Math.sqrt(Math.pow(x4 - x3, 2) + Math.pow(y4 - y3, 2)); // Длина третьей стороны
        double side4 = Math.sqrt(Math.pow(x1 - x4, 2) + Math.pow(y1 - y4, 2)); // Длина четвертой стороны
        return side1 + side2 + side3 + side4;
    }
    public double calculArea() {
        double height = Math.abs(y2 - y1);
        double base = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)) +
                Math.sqrt(Math.pow(x3 - x4, 2) + Math.pow(y3 - y4, 2)) / 2;
        return base * height;
    }
}
