package com.maratonweb.apirunning.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "races")
public class Race {

    @Id
    private String id;
    private String name;
    private String description;
    private LocalDate date;
    private LocalTime hour;
    private String organaizer;
    private String address;
    private String state;
    private String country;
    private Category category;
    private List<Type> type;
    private List<Float> distance;
    private String urlOficialWeb;
    private String urlImage;
}
