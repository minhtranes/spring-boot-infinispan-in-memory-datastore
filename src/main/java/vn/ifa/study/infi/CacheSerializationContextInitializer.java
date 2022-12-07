package vn.ifa.study.infi;

import org.infinispan.protostream.GeneratedSchema;
import org.infinispan.protostream.annotations.AutoProtoSchemaBuilder;

@AutoProtoSchemaBuilder(includeClasses = { Invoice.class }, schemaFileName = "cache.proto", schemaFilePath = "proto/")
public interface CacheSerializationContextInitializer extends GeneratedSchema {

}
