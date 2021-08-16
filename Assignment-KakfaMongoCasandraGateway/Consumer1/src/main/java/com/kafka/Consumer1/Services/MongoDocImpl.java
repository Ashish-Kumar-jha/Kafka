package com.kafka.Consumer1.Services;

import com.kafka.Consumer1.Dao.MongoDao;
import com.kafka.Consumer1.Document.MongoDoc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalTime;

@Service
public class MongoDocImpl implements ServiceInter {
    @Autowired
    MongoDao mongoDao;

    @Override
    public MongoDoc saveMongoData(String payload) {
       // LocalTime time = LocalTime.now();
        MongoDoc m=new MongoDoc();
        m.setSms(payload);
        m.setTime(LocalTime.now());
        mongoDao.save(m);

        return m;

    }
}
