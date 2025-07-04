package com.hcl.lld.design_pattern.structural.adapter;

public class Pixel1080Video implements VideoQuality {
    @Override
    public void quality() {
        System.out.println("Streaming 1080P Video");
    }
}
