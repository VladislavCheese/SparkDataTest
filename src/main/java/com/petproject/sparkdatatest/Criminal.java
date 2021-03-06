package com.petproject.sparkdatatest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import unsafe.starter.spark.data.annotations.ForeignKeyName;
import unsafe.starter.spark.data.annotations.Source;

import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Source("data/criminals.csv")
public class Criminal {

    private long id;

    private String name;

    private int number;

    @ForeignKeyName(fieldName = "criminalId")
    private List<Order> orders;
}
