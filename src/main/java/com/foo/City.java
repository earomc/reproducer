package com.foo;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import org.bson.types.ObjectId;

@Entity(value = "cities")
public class City implements FoundingRequestable {

    //THIS is what triggers the error! If the field is removed there's no error!
    private static final Class<? extends FoundingProcedure<City>> PROCEDURE_CLASS = CityFoundingProcedure.class;

    @Id
    private ObjectId id;

    public City() {

    }

    @Override
    public Class<? extends FoundingProcedure<?>> getProcedure() {
        /*normally returns PROCEDURE_CLASS. I removed this to show that the error still occurs
        even when not having this method return the static field.
        */
        return null;
    }

}


