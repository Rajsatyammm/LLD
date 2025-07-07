package com.hcl.lld.design_pattern.structural.bridge;

public class Main {
    public static void main(String[] args) {
        TV tv = new SamsungTV(new SamsungTVRemote());
        tv.currentVolume();
        tv.increaseVolume();
        tv.currentVolume();
    }
}
