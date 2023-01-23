package com.volkswagen.assigment.location;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name="tbl_Location")
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PK_location")
    private Integer locationId;

    @Column(name = "location_name")
    private String LocationName;

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    public String getLocationName() {
        return LocationName;
    }

    public void setLocationName(String locationName) {
        LocationName = locationName;
    }
}
