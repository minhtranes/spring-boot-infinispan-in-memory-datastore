FROM amazoncorretto:11
COPY target/infinispan-in-memory-datastore /app/infinispan-in-memory-datastore
WORKDIR /app/infinispan-in-memory-datastore
ENTRYPOINT ["/bin/sh", "run.sh"]