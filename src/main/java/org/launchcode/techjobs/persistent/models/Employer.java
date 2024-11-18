package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location is required")
    @Size(max = 256, message = "Location has a maximum size of 256 characters")
    private String location;

    public void setLocation(String location) {this.location = location; }

    public String getLocation() {return location; }

    @OneToMany(mappedBy = "employer")
    @JoinColumn(name = "employer_id")
    private final List<Job> jobs = new ArrayList<>();
    //change from final to static, could remove?

    //no-arg constructor required for Entity
    public Employer() {}
}
