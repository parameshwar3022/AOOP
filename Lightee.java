public class Lightee {
    private boolean isOn;
    private int brightness;
    private String color;

    public Lightee() {
        this.isOn = false;
        this.brightness = 100;
        this.color = "white";
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public int getBrightness() {
        return brightness;
    }

    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}

