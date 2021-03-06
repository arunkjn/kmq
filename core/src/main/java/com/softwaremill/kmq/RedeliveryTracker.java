package com.softwaremill.kmq;

import com.softwaremill.kmq.redelivery.RedeliveryActors;

import java.io.Closeable;

/**
 * Tracks which messages has been processed, and redelivers the ones which are not processed until their redelivery
 * time.
 */
public class RedeliveryTracker {
    public static Closeable start(KafkaClients clients, KmqConfig config) {
        return RedeliveryActors.start(clients, config);
    }
}
