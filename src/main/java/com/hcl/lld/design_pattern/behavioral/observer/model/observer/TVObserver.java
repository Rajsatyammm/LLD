package com.hcl.lld.design_pattern.behavioral.observer.model.observer;

public class TVObserver implements Observer {

    @Override
    public void update() {
        System.out.println("TV observer update");
    }
}
