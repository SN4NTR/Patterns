package com.company.patterns.observer.subject;

import com.company.patterns.observer.listener.Observer;

public interface Subject {

    void registerObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();
}
