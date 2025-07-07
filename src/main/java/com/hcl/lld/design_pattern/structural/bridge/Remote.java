package com.hcl.lld.design_pattern.structural.bridge;

public interface Remote {
    void volumeUp();
    void volumeDown();
    void nextChannel();
    void prevChannel();
    void currentVolume();
}
