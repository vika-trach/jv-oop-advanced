package core.basesyntax;

public class RightTriangle extends Figure {
    private int firstLeg;
    private int secondLeg;

    public RightTriangle(Color color, int firstLeg, int secondLeg) {
        super(color);
        this.firstLeg = firstLeg;
        this.secondLeg = secondLeg;
    }

    @Override
    public double calculateArea() {
        return firstLeg * secondLeg * 0.5;
    }

    @Override
    public void draw() {
        System.out.println("Figure: " + FigureType.RIGHT_TRIANGLE
                + ", area :" + calculateArea()
                + " sq.units, firstLeg:" + firstLeg
                + ", secondLeg :" + secondLeg
                + ", color:" + getColor());
    }
}