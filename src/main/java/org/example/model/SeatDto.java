package org.example.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
public class SeatDto {
    private SeatNumberCompositeKey seatNumberCompositeKey;
    @Schema(example = "Studio A")
    private String studioName;
    @Schema(example = "available")
    private String status;
    @Schema(example = "1")
    private Long scheduleID;
}
