package com.grafysi.dbzconsumer.grpc;

import com.grafysi.dbzconsumer.DbzConsumerGrpc;
import com.grafysi.dbzconsumer.JsonRecord;
import com.grafysi.dbzconsumer.SourceTopic;
import io.grpc.stub.StreamObserver;
import org.apache.avro.generic.GenericRecord;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.util.ArrayList;
import java.util.List;

public class DbzConsumerService extends DbzConsumerGrpc.DbzConsumerImplBase {

    private final List<KafkaConsumer<GenericRecord, GenericRecord>> consumers;

    public DbzConsumerService() {
        this.consumers = new ArrayList<>();
    }

    @Override
    public void addConsumer(SourceTopic request, StreamObserver<JsonRecord> streamObserver) {

    }
}
