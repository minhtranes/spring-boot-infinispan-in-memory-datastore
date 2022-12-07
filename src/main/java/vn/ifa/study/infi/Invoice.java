package vn.ifa.study.infi;

import org.infinispan.protostream.annotations.ProtoField;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Invoice {

    @ProtoField(1)
    String id;

    @ProtoField(2)
    String customerName;

}
