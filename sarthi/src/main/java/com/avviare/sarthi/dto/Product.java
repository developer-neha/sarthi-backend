package com.avviare.sarthi.dto;
import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String p_name;
    private String p_desc;
    private String imagePath;
    private double rate;
    private double discount;

    private LocalDate delivery_date;
    private LocalDate return_duration;

    private String isdeliveryfree;
    private String isreturn;
    private String isCOD;
    
    
    
    
}
