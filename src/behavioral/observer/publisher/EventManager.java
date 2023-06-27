package behavioral.observer.publisher;

import behavioral.observer.listeners.EventListener;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EventManager {
    Map<String, List<EventListener>> listeners = new HashMap<>();

    public EventManager(String... eventTypes) {
        for (String eventType : eventTypes) {
            this.listeners.put(eventType, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, EventListener listener) {
        List<EventListener> eventListeners = listeners.get(eventType);
        eventListeners.add(listener);
    }

    public void unsubscribe(String eventType, EventListener listener) {
        List<EventListener> eventListeners = listeners.get(eventType);
        eventListeners.remove(listener);
    }

    public void notify(String eventType, File file) {
        List<EventListener> eventListeners = listeners.get(eventType);
        for (EventListener listener : eventListeners) {
            listener.update(eventType, file);
        }
    }
}
