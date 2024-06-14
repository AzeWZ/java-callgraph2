package com.adrninistrator.javacg.neo4j;

import org.neo4j.driver.AuthTokens;
import org.neo4j.driver.Driver;
import org.neo4j.driver.GraphDatabase;
import org.neo4j.ogm.drivers.bolt.driver.BoltDriver;
import org.neo4j.ogm.session.Session;
import org.neo4j.ogm.session.SessionFactory;

public class Neo4jUtils {
    private static BoltDriver driver;

    private static SessionFactory sessionFactory ;
    static {
        // URI examples: "neo4j://localhost", "neo4j+s://xxx.databases.neo4j.io"
        final String dbUri = "neo4j://localhost";
        final String dbUser = "neo4j";
        final String dbPassword = "repair-super-liter-economy-lecture-5367";

        Driver nativeDriver = GraphDatabase.driver(dbUri, AuthTokens.basic(dbUser, dbPassword));
        nativeDriver.verifyConnectivity();
        driver = new BoltDriver(nativeDriver);
        sessionFactory = new SessionFactory(driver,"com.adrninistrator.javacg.dto");
    }

    public static Session getSession(){
        Session session = sessionFactory.openSession();
        return session;
    }
}
