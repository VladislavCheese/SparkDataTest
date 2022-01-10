package com.petproject.sparkdatatest;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import unsafe.starter.spark.data.annotations.Source;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Source("data/criminals.csv")
public class Criminal {
    private long id;
    private String name;
    private int number;
}
