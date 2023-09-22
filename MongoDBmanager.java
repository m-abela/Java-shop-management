package com.mycompany.robertshop;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;

/**
 *
 * @author maxdocs
 */
public class MongoDBmanager {
    private static MongoClient client;

    static {
        try {
            client = MongoClients.create("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static MongoClient getClient() {
        return client;
    }
}