package com.kafka.Consumer2.EntiyCassandra;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class Cassandra {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @PrimaryKey
    int id;
    private String sms;

}
