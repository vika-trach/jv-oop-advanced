package core.basesyntax;

import java.util.Random;

public class ColorSupplier {
    private Random random;

    public ColorSupplier() {
        random = new Random();
    }

    public Color getRandomColor() {
        return Color.values()[random.nextInt(Color.values().length)];
    }

}