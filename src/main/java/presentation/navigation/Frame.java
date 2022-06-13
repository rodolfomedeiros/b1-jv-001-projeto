package presentation.navigation;

import java.util.HashMap;
import java.util.Scanner;

public abstract class Frame {
    protected Navigator navigator;
    protected String key;
    protected HashMap<String, Object> params = new HashMap<>();
    protected Scanner scanner = new Scanner(System.in);

    public Frame(String key, Navigator navigator, HashMap<String, Object> params) {
        this.navigator = navigator;
        this.key = key;
        this.params = params;
    }

    public Frame(String key,Navigator navigator) {
        this.key = key;
        this.navigator = navigator;
    }

    public String getKey() {
        return key;
    }

    public HashMap<String, Object> getParams() {
        return params;
    }

    public abstract void setup();
    public abstract void render() throws Exception;
}
