package com.hcl.lld.design_pattern.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Bullet bullet9mm = Bullet.builder()
            .speed("2KM/H")
            .length(2)
            .weight(3)
            .name("9MM")
            .build();

        Bullet bullet5mm = Bullet.builder()
            .speed("2KM/H")
            .length(2)
            .weight(3)
            .name("5MM")
            .build();

        MovingBullet movingBullet = new MovingBullet(bullet9mm, "x:3, y:4", "N", "Ram");

        List<MovingBullet> bulletList = new ArrayList<>();
        for(int i=0; i<10000; ++i) {
            MovingBullet bullet = (MovingBullet) movingBullet.clone();
            bullet.setBullet(i % 2 == 0 ? bullet5mm : bullet9mm);
            bullet.setDirection("W");
            bulletList.add(bullet);
        }
    }
}
