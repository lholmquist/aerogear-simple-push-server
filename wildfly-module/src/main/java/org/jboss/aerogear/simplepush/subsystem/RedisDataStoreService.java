package org.jboss.aerogear.simplepush.subsystem;

import org.jboss.aerogear.simplepush.server.datastore.DataStore;
import org.jboss.aerogear.simplepush.server.datastore.JpaDataStore;
import org.jboss.aerogear.simplepush.server.datastore.RedisDataStore;
import org.jboss.msc.service.StartContext;
import org.jboss.msc.service.StartException;

public class RedisDataStoreService extends DataStoreService {

    private final String host;
    private final int port;

    public RedisDataStoreService(final String host, final int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public synchronized void start(StartContext context) throws StartException {
    }

    @Override
    public synchronized DataStore getValue() throws IllegalStateException, IllegalArgumentException {
        return new RedisDataStore(host, port);
    }

}
