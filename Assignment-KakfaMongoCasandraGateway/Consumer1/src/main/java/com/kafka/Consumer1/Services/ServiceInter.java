package com.kafka.Consumer1.Services;

import com.kafka.Consumer1.Document.MongoDoc;

public interface ServiceInter {
   public MongoDoc saveMongoData(String payload);
}
