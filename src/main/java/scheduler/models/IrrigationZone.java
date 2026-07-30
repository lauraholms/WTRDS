package scheduler.models;

public class IrrigationZone {

    private String name;

    private double area;

    private boolean enabled;

    public IrrigationZone(
            String name,
            double area,
            boolean enabled) {

        this.name = name;

        this.area = area;

        this.enabled = enabled;

    }

    public String getName() {

        return name;

    }

    public double getArea() {

        return area;

    }

    public boolean isEnabled() {

        return enabled;

    }

}
