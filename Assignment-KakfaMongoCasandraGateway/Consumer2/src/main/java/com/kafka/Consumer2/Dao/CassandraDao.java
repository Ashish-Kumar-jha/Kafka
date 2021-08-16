package com.kafka.Consumer2.Dao;

import com.kafka.Consumer2.EntiyCassandra.Cassandra;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface CassandraDao extends CassandraRepository<Cassandra,Integer> {
}
