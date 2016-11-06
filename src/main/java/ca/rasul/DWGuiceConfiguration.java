package ca.rasul;

import io.dropwizard.Configuration;
import org.hibernate.validator.constraints.NotEmpty;

public class DWGuiceConfiguration extends Configuration {
    // TODO: implement service configuration

    @NotEmpty
    private String name;

    public String getName(){
        return name;
    }
}
