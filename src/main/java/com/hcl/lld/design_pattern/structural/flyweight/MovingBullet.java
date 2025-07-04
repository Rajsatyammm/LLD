package com.hcl.lld.design_pattern.structural.flyweight;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovingBullet implements Clonable {
    private Bullet bullet;
    private String coordinate;
    private String direction;
    private String shooter;

    @Override
    public Clonable clone() {
        return new MovingBullet(bullet, coordinate, direction, shooter);
    }
}
