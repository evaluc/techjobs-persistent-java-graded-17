package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @NotBlank(message = "Description is required")
    @Size(max = 512, message = "Description has a maximum size of 512 characters")
    private String description;

    public void setDescription(String description) {this.description = description; }

    public String getDescription() {return description; }

    //no-arg constructor required for Entity
    public Skill() {}

}
