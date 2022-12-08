package vn.ifa.study.infi.protoadapter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.infinispan.protostream.annotations.ProtoAdapter;
import org.infinispan.protostream.annotations.ProtoFactory;
import org.infinispan.protostream.annotations.ProtoField;

@ProtoAdapter(LocalDate.class)
public class LocalDateAdapter {

    @ProtoFactory
    LocalDate create(final String localDate) {

        return LocalDate.parse(localDate, DateTimeFormatter.ISO_DATE);
    }

    @ProtoField(1)
    String getLocalDate(final LocalDate date) {

        return date.format(DateTimeFormatter.ISO_DATE);
    }
}
