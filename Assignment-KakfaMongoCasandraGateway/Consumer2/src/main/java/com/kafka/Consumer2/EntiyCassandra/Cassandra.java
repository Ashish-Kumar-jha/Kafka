package com.kafka.Consumer2.EntiyCassandra;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.Table;


import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Cassandra {

    private String sms;
    LocalTime time;
}
