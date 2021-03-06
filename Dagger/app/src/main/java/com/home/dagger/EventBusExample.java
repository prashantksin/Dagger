package com.home.dagger;

import android.util.Log;

import com.squareup.otto.Subscribe;

import javax.inject.Inject;

/**
 * Created by davendar.ojha on 12/26/15.
 */
public class EventBusExample {

    @Inject
    OttoEventBus eventBus;

    public EventBusExample() {
        Injector.APP_COMPONENT.inject(this);
        eventBus.register(this);
    }

    @Subscribe
    public void onLoadEvent(LoadEvent event) {
        Log.d("BlBlka", "Hello" + event.getI());
    }

}
