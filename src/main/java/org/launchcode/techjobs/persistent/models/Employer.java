package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location is required")
    @Size(max = 256, message = "Location has a maximum size of 256 characters")
    private String location;

    public void setLocation(String location) {this.location = location; }

    public String getLocation() {return location; }

    //no-arg constructor required for Entity
    public Employer() {}
}
