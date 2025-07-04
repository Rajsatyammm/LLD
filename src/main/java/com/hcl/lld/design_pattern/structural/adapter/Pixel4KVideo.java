package com.hcl.lld.design_pattern.structural.adapter;

public class Pixel4KVideo implements VideoQuality {
    @Override
    public void quality() {
        System.out.println("Streaming 4K Video");
    }
}
