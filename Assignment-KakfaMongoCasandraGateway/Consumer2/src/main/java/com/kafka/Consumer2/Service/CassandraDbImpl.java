package com.kafka.Consumer2.Service;

import com.kafka.Consumer2.Dao.CassandraDao;
import com.kafka.Consumer2.EntiyCassandra.Cassandra;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalTime;

@Service
public class CassandraDbImpl implements ServiceInter{

    @Autowired
    CassandraDao cassandraDao;

    @Override
    public void saveCassandra(String sms) {
        Cassandra c=new Cassandra();
        c.setSms(sms);
        c.setTime(LocalTime.now());
        cassandraDao.save(c);
    }
}
