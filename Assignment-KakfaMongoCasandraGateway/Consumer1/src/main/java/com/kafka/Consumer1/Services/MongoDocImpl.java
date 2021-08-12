package com.kafka.Consumer1.Services;

import com.kafka.Consumer1.Dao.MongoDao;
import com.kafka.Consumer1.Document.MongoDoc;
import org.springframework.beans.factory.annotation.Autowired;

public class MongoDocImpl implements MongoDocInter {
    @Autowired
    MongoDao mongoDao;

    @Override
    public void saveMongoData(String payload) {
        MongoDoc m=new MongoDoc(payload);

    }
}
