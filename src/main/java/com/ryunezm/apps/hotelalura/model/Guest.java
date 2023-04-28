package com.ryunezm.apps.hotelalura.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Guest{
    private String id;
    private String name;
    private String email;
    private String phone;
}
