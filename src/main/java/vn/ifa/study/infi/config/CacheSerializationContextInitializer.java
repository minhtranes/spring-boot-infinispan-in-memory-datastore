package vn.ifa.study.infi.config;

import org.infinispan.protostream.GeneratedSchema;
import org.infinispan.protostream.annotations.AutoProtoSchemaBuilder;

import vn.ifa.study.infi.model.Invoice;

@AutoProtoSchemaBuilder(includeClasses = { Invoice.class }, schemaFileName = "cache.proto", schemaFilePath = "proto/")
public interface CacheSerializationContextInitializer extends GeneratedSchema {

}
