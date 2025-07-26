package com.hcl.lld.design_pattern.behavioral.observer.main;

import com.hcl.lld.design_pattern.behavioral.observer.model.observable.Observable;
import com.hcl.lld.design_pattern.behavioral.observer.model.observable.WeatherObservable;
import com.hcl.lld.design_pattern.behavioral.observer.model.observer.PhoneObserver;
import com.hcl.lld.design_pattern.behavioral.observer.model.observer.TVObserver;

public class Main {
    public static void main(String[] args) {
        Observable observable = new WeatherObservable();
        observable.addObserver(new PhoneObserver());
        observable.addObserver(new TVObserver());

        observable.notifyObservers();
    }
}
