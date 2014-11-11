package com.richard.config;

import com.mongodb.Mongo;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * User: u0165547
 * Created: 11/11/2014 4:28 PM
 */
/*@Configuration
@EnableMongoRepositories*/
public class MongoConfig {/*extends AbstractMongoConfiguration {
    @Override
    protected String getDatabaseName() {
        return "mountain-lion";
    }

    @Override
    public Mongo mongo() throws Exception {
        return new Mongo();
    }

    @Override
    public String getMappingBasePackage() {
        return "com.richard.model";
    }*/

}
