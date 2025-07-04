package com.hcl.lld.design_pattern.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Bullet {
    private int weight;
    private int length;
    private String name;
    private String speed;
}
