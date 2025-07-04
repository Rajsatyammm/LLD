package com.hcl.lld.design_pattern.structural.adapter;

public class NetflixStreamingPlatform implements StreamingPlatform {

    VideoQuality videoQuality;

    public NetflixStreamingPlatform(VideoQuality videoQuality) {
        this.videoQuality = videoQuality;
    }

    @Override
    public void stream() {
        showPlatform();
        videoQuality.quality();
    }

    @Override
    public void showPlatform() {
        System.out.println("NetflixStreamingPlatform");
    }
}
