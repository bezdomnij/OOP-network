package com.codecool.network.devices;

public class Smart extends ScreenedDevice {
    NormalGetter normalGetter;
    private static int deviceCounter = 0;
    private int id = deviceCounter++;
    private final String type = "smart";
    private String uniqueName;

    public Smart() {
        this.uniqueName = this.id + type;
    }

}
