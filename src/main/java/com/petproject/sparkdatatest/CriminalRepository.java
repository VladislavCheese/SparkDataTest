package com.petproject.sparkdatatest;

import unsafe.starter.spark.data.api.SparkRepository;

import java.util.List;

public interface CriminalRepository extends SparkRepository<Criminal> {
    List<Criminal> findByNumberBetween(int min, int max);
}
