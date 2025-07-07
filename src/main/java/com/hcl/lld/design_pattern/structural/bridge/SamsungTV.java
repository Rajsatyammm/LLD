package com.hcl.lld.design_pattern.structural.bridge;

public class SamsungTV implements TV {
    private Remote remote;

    public SamsungTV(Remote remote) {
        this.remote = remote;
    }

    @Override
    public void increaseVolume() {
        remote.volumeUp();
    }

    @Override
    public void decreaseVolume() {
        remote.volumeDown();
    }

    @Override
    public void nextChannel() {
        remote.nextChannel();
    }

    @Override
    public void prevChannel() {
        remote.prevChannel();
    }

    @Override
    public void currentVolume() {
        remote.currentVolume();
    }
}
