package com.hyf.flyway.conf;

import org.flywaydb.core.api.callback.Callback;
import org.flywaydb.core.api.callback.Context;
import org.flywaydb.core.api.callback.Event;
import org.springframework.stereotype.Component;

@Component
public class CustomizedCallback implements Callback {

    @Override
    public boolean supports(Event event, Context context) {
//        return Event.BEFORE_MIGRATE == event;
        return true;
    }

    @Override
    public boolean canHandleInTransaction(Event event, Context context) {
        return true;
    }

    @Override
    public void handle(Event event, Context context) {
        System.out.println("Event: " + event.getId());
    }

    @Override
    public String getCallbackName() {
        return getClass().getName();
    }
}
