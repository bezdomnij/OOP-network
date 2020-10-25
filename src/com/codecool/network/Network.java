package com.codecool.network;

import com.codecool.network.devices.Device;
import com.codecool.network.devices.Normal;
import com.codecool.network.devices.NormalGetter;

import java.util.HashSet;
import java.util.Set;

public class Network implements NormalGetter {
    Set<Device> deviceSet;

    public Network() {
        this.deviceSet = new HashSet<>();
    }

    @Override
    public Set<Device> getNormalDevices() {
        Set<Device> normals = new HashSet<>();
        for (Device d: deviceSet) {
            if (d instanceof Normal) {
                normals.add(d);
            }
        }
        return normals;
    }
}
