package com.hcl.lld.design_pattern.structural.bridge;

public class SamsungTVRemote implements Remote {
    private int volume;
    private int channel;

    @Override
    public void volumeUp() {
        volume++;
        System.out.println("Volume++ " + volume);
    }

    @Override
    public void volumeDown() {
        volume--;
        System.out.println("Volume-- " + volume);
    }

    @Override
    public void nextChannel() {
        channel++;
        System.out.println("Channel++ " + channel);
    }

    @Override
    public void prevChannel() {
        channel--;
        System.out.println("Channel-- " + channel);
    }

    @Override
    public void currentVolume() {
        System.out.println("Current Volume :: " + volume);
    }
}
