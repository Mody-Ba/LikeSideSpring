package com.dailycodework.LikeSdehotel.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BackingResponse {
    private long Id;
    private LocalDate CheckInDate;
    private LocalDate OutInDate;
    private String GuestName;
    private String GustEmail;
    private int numOfAdults;
    private int NameOfChildren;
    private int TotalNumOfGuests;
    private String BookingConfirmationCode;
    private RoomResponse room;


}
