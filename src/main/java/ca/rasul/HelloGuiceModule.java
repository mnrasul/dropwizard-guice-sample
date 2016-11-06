package ca.rasul;


import ca.rasul.services.Greeter;
import ca.rasul.services.HelloGreeter;
import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import javax.inject.Named;

/**
 * @author Nasir Rasul {@literal nasir@rasul.ca}
 */
public class HelloGuiceModule extends AbstractModule {

    @Override
    protected void configure() {
    }

    @Provides
    @Named("message")
    public String provideMessage(DWGuiceConfiguration serverConfiguration) {
        return serverConfiguration.getName();
    }

    @Provides
    public Greeter getGreeter(){
        return new HelloGreeter();
    }
}
