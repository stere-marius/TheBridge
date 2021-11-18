package ro.marius.thebridge;

public class TestClass {

    public static void main(String[] args) {
        double dx = 1000 - 1000;
        // Minus to correct for coord re-mapping
        double dy = -(33 - 31);

        double inRads = Math.atan2(dy, dx);

        // We need to map to coord system when 0 degree is at 3 O'clock, 270 at 12 O'clock
        if (inRads < 0)
            inRads = Math.abs(inRads);
        else
            inRads = 2 * Math.PI - inRads;

        System.out.println(Math.toDegrees(inRads));
    }

}
