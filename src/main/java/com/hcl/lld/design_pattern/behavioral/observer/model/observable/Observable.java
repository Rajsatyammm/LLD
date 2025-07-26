package com.hcl.lld.design_pattern.behavioral.observer.model.observable;

import com.hcl.lld.design_pattern.behavioral.observer.model.observer.Observer;

public interface Observable {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
