package vn.ifa.study.infi.config;

import org.infinispan.protostream.GeneratedSchema;
import org.infinispan.protostream.annotations.AutoProtoSchemaBuilder;

import vn.ifa.study.infi.protoadapter.InvoiceAdapter;
import vn.ifa.study.infi.protoadapter.InvoiceItemAdapter;
import vn.ifa.study.infi.protoadapter.LocalDateAdapter;

@AutoProtoSchemaBuilder(includeClasses = { InvoiceAdapter.class, InvoiceItemAdapter.class,
        LocalDateAdapter.class }, schemaFileName = "cache.proto", schemaFilePath = "proto/")
public interface CacheSerializationContextInitializer extends GeneratedSchema {

}
