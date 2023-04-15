package com.ryunezm.apps.hotelalura.model;

import com.ryunezm.apps.hotelalura.factory.PersonFactory;

public class Administrator extends Person {

    public static class AdministratorFactory implements PersonFactory{
        @Override
        public Person createPerson(){
            return new Administrator();
        }
    }
}
