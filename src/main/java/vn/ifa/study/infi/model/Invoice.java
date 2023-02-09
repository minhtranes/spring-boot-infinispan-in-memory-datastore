package vn.ifa.study.infi.model;

import org.infinispan.api.annotations.indexing.Indexed;
import org.infinispan.protostream.annotations.ProtoField;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Indexed
public class Invoice {

    @ProtoField(1)
    String id;

    @ProtoField(2)
    String customerName;

}
