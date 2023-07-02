package com.UniversityEventManagement.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="eventmodel")
public class EventModel {
    @Id
    private Integer eventId;
    @NotBlank
    private String eventName;
    @NotBlank
    private String locationOfEvent;
    @NotNull
    private LocalDate date;
    @FutureOrPresent
    private String startTime;
    @Future
    private String endTime;
}
