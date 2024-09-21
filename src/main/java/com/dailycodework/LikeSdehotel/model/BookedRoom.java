package com.dailycodework.LikeSdehotel.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="bookedRoom")
public class BookedRoom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long bookingId;
    @Column(name="check_In")
    private LocalDate checkInDate;
    @Column(name="check_In")
    private LocalDate checkOutDate;
    @Column(name="guest_FullNme")
    private String guestFullName;
    @Column(name="guest_FullEmail")
    private String guestFullEmail;
    @Setter
    @Column(name="adults")
    private int numberOfAdults;
    @Setter
    @Column(name="children")
    private int numberOfChildren;
    @Column(name="total_guest")
    private int totalNumberOfGuests;
    @Setter
    @Column(name="confirmation_code")
    private String bookingConfirmation;
    @JoinColumn(name="room_id")
    private Room room;

}
