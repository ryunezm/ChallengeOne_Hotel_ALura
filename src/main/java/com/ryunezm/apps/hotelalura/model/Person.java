package com.ryunezm.apps.hotelalura.model;

import com.ryunezm.apps.hotelalura.factory.PersonFactory;

public abstract class Person {

    private String name;
    private String user;

    public static Person createPerson(PersonFactory personFactory){
        return personFactory.createPerson();
    }
}
