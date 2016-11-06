package ca.rasul;

import ca.rasul.resources.HelloResource;
import com.google.inject.Injector;
import com.hubspot.dropwizard.guice.GuiceBundle;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DWGuiceApplication extends Application<DWGuiceConfiguration> {

    Injector injector;
    private GuiceBundle<DWGuiceConfiguration> guiceBundle;
    public static void main(final String[] args) throws Exception {
        new DWGuiceApplication().run(args);
    }

    @Override
    public String getName() {
        return "DWGuice";
    }

    @Override
    public void initialize(final Bootstrap<DWGuiceConfiguration> bootstrap) {
        guiceBundle = GuiceBundle.<DWGuiceConfiguration>newBuilder()
                .addModule(new HelloGuiceModule())
                .setConfigClass(DWGuiceConfiguration.class)
                .build();
        bootstrap.addBundle(guiceBundle);
        // TODO: application initialization
    }

    @Override
    public void run(final DWGuiceConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
        environment.jersey().register(HelloResource.class);
    }

}
