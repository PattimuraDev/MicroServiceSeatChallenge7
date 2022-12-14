package org.example.service;

import org.example.model.Seat;
import org.example.model.SeatDto;
import org.example.model.SeatNumberCompositeKey;
import java.util.List;

public interface SeatService {
    Seat addSeats(Seat seats);

    void updateSeatsStatus(String newStatus, String nomorBarisKursi, String nomorKolomKursi);

    Seat getSeatById(SeatNumberCompositeKey seatNumberCompositeKey);

    List<Seat> getAllSeatsAvailable();

    void deleteSeats(SeatNumberCompositeKey idSeat);

    Seat seatsDtoMapToEntity(SeatDto seatsDto);
}
