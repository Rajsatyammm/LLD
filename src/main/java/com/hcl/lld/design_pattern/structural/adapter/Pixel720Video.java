package com.hcl.lld.design_pattern.structural.adapter;

public class Pixel720Video implements VideoQuality {
    @Override
    public void quality() {
        System.out.println("Streaming 720P Video");
    }
}
