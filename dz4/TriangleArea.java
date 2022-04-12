package homework4;

public class TriangleArea {
    public static double calculateArea(int sideA, int sideB, int sideC) throws Exception {
        if (sideA <= 0 || sideB <= 0 || sideC <= 0) throw new Exception("Некорректный треугольник!!");
        if (sideA + sideB <= sideC || sideA + sideC <= sideB || sideB + sideC <= sideA)
            throw new Exception("Некорректный треугольник!!");
        double halfP = (sideA + sideB + sideC) / 2;
        return Math.sqrt(halfP * (halfP - sideA) * (halfP - sideB) * (halfP - sideC));
    }
}

