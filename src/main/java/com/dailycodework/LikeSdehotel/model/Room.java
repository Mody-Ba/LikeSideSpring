package com.dailycodework.LikeSdehotel.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.sql.Blob;
import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@Entity
@Table(name="room")
public class Room {

    // Getters and setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String roomType;

    private BigDecimal roomPrice;

    private boolean booked = false;

    @OneToMany(mappedBy = "room", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<BookedRoom> bookings;

    @Lob
    private Blob photo;

    public Room() {
        this.bookings = new ArrayList<>();
    }

}
