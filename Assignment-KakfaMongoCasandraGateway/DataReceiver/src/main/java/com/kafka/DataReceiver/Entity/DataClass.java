package com.kafka.DataReceiver.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DataClass {
    private int id;
    private String name;
    private String college;
}
