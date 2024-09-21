package com.dailycodework.LikeSdehotel.Response;

import jakarta.persistence.Entity;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Base64;
import java.util.List;
@Data
@NoArgsConstructor
@Entity
public class RoomResponse {
    private long id;
    private String roomType;
    private BigDecimal roomPrice;
    private boolean isBooked;
    private String photo;
    private List<BackingResponse> Bookings;


    public RoomResponse(long id, String roomType, BigDecimal roomPrice) {
        this.id = id;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
    }

    public RoomResponse(long id, String roomType, BigDecimal roomPrice, boolean isBooked,
                        byte[] photoBytes, List<BackingResponse> bookings) {
        this.id = id;
        this.roomType = roomType;
        this.roomPrice = roomPrice;
        this.isBooked = isBooked;
        this.photo = photoBytes != null ?  Base64.getEncoder().encodeToString(photoBytes) : null;
        Bookings = bookings;
    }
}
