package com.codecool.network.devices;

public enum SmartScreenSize {
    EDTV (5),
    HD (10),
    FULL_HD (15),
    UHD (20);

    private final int powerLossFactor;

    SmartScreenSize(int powerLossFactor) {
        this.powerLossFactor = powerLossFactor;
    }
}
