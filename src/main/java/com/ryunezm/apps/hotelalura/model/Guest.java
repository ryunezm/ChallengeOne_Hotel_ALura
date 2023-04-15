package com.ryunezm.apps.hotelalura.model;

import com.ryunezm.apps.hotelalura.factory.PersonFactory;

public class Guest extends Person{

    public static class GuestFactory implements PersonFactory {
        @Override
        public Person createPerson(){
            return new Guest();
        }
    }
}
