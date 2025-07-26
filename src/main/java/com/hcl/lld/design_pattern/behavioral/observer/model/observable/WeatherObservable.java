package com.hcl.lld.design_pattern.behavioral.observer.model.observable;

import com.hcl.lld.design_pattern.behavioral.observer.model.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherObservable implements Observable {

    private final List<Observer> observers = new ArrayList<Observer>();

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
