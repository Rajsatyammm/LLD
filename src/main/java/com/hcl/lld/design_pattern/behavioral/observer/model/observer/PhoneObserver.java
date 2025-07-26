package com.hcl.lld.design_pattern.behavioral.observer.model.observer;

public class PhoneObserver implements Observer {

    @Override
    public void update() {
        System.out.println("Phone observer update");
    }
}
