package com.hcl.lld.design_pattern.structural.adapter;

public interface IStreamingFactory {
    StreamingPlatform getStreamingPlatform(Platform platform, Quality quality);
}
