package com.hcl.lld.assignment.parking_lot.model.user;

import lombok.Data;

@Data
public abstract class User {
    private int id;
    private String name;
    private String email;
}
