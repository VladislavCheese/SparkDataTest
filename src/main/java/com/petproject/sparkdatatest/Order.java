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
@Source("data/orders.csv")
public class Order {
    private String name;
    private String desc;
    private Integer pric;
    private Long criminalId;
}
