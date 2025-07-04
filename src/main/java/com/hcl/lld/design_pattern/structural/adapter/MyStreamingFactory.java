package com.hcl.lld.design_pattern.structural.adapter;

public class MyStreamingFactory implements IStreamingFactory {
    @Override
    public StreamingPlatform getStreamingPlatform(Platform platform, Quality quality) {
        StreamingPlatform streamingPlatform = switch (platform) {
            case YOUTUBE -> new YoutubeStreamingPlatform(getVideoQuality(quality));
            case NETFLIX -> new NetflixStreamingPlatform(getVideoQuality(quality));
            default -> throw new RuntimeException();
        };
        return streamingPlatform;
    }

    public VideoQuality getVideoQuality(Quality quality) {
        VideoQuality videoQuality = switch (quality) {
            case PIXEL4K -> new Pixel4KVideo();
            case PIXEL1080P -> new Pixel1080Video();
            case PIXEL720P -> new Pixel720Video();
            default -> throw new RuntimeException();
        };
        return videoQuality;
    }
}
