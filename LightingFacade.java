import java.util.HashMap;
import java.util.Map;

public class LightingFacade {
    private Map<String, Lightee> lights;

    public LightingFacade() {
        lights = new HashMap<>();
        lights.put("living_room", new Lightee());
        lights.put("kitchen", new Lightee());
        lights.put("bedroom", new Lightee());
    }

    public void turnOnAll() {
        for (Lightee light : lights.values()) {
            light.setOn(true);
        }
    }

    public void turnOffAll() {
        for (Lightee light : lights.values()) {
            light.setOn(false);
        }
    }

    public void setBrightness(String zone, int brightness) {
        Lightee light = lights.get(zone);
        if (light != null) {
            light.setBrightness(brightness);
        }
    }

    public void setColor(String zone, String color) {
        Lightee light = lights.get(zone);
        if (light != null) {
            light.setColor(color);
        }
    }

    public void sceneEvening() {
        setColor("living_room", "warm white");
        setBrightness("living_room", 50);
        setColor("kitchen", "soft yellow");
        setBrightness("kitchen", 30);
        setColor("bedroom", "dim blue");
        setBrightness("bedroom", 20);
    }

    public void sceneMovie() {
        turnOffAll();
        setBrightness("living_room", 20);
    }

    public Lightee getLight(String zone) {
        return lights.get(zone);
    }
}

