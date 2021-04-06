package eci.ieti;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

@Configuration
public class AppConfiguration {

    @Bean
    public MongoDbFactory mongoDbFactory() throws Exception {

         MongoClientURI uri = new MongoClientURI(
        "mongodb+srv://aosfandres:aosfandres@ieti.mqigr.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");

        MongoClient mongoClient = new MongoClient(uri);

        return new SimpleMongoDbFactory( mongoClient, "IETI");

    }

    @Bean
    public MongoTemplate mongoTemplate() throws Exception {

        MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory());

        return mongoTemplate;

    }

}