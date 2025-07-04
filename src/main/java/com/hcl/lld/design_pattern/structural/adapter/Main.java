package com.hcl.lld.design_pattern.structural.adapter;

public class Main {
    public static void main(String[] args) {
        IStreamingFactory factory = new MyStreamingFactory();
        StreamingPlatform platform = factory.getStreamingPlatform(Platform.NETFLIX, Quality.PIXEL4K);
        platform.stream();
    }
}
