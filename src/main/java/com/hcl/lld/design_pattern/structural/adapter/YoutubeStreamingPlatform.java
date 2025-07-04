package com.hcl.lld.design_pattern.structural.adapter;

public class YoutubeStreamingPlatform implements StreamingPlatform {

    private VideoQuality videoQuality;

    public YoutubeStreamingPlatform(VideoQuality videoQuality) {
        this.videoQuality = videoQuality;
    }

    @Override
    public void stream() {
        showPlatform();
        videoQuality.quality();
    }

    @Override
    public void showPlatform() {
        System.out.println("YoutubeStreamingPlatform");
    }
}
