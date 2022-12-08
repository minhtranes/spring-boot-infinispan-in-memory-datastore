package vn.ifa.study.infi.protoadapter;

import java.time.LocalDate;

import org.infinispan.protostream.annotations.ProtoAdapter;
import org.infinispan.protostream.annotations.ProtoFactory;
import org.infinispan.protostream.annotations.ProtoField;

import vn.ifa.study.infi.model.Invoice;

@ProtoAdapter(Invoice.class)
public class InvoiceAdapter {

    @ProtoFactory
    Invoice create(final String id, final String customerName, final LocalDate issuedDate) {

        return Invoice.builder()
                .id(id)
                .customerName(customerName)
                .issuedDate(issuedDate)
                .build();
    }

    @ProtoField(2)
    String getCustomerName(final Invoice invoice) {

        return invoice.getCustomerName();
    }

    @ProtoField(1)
    String getId(final Invoice invoice) {

        return invoice.getId();
    }

    @ProtoField(number = 3)
    LocalDate getIssuedDate(final Invoice invoice) {

        return invoice.getIssuedDate();
    }
}
