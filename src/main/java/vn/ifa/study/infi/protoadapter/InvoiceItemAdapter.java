package vn.ifa.study.infi.protoadapter;

import org.infinispan.protostream.annotations.ProtoAdapter;
import org.infinispan.protostream.annotations.ProtoFactory;
import org.infinispan.protostream.annotations.ProtoField;

import vn.ifa.study.infi.model.Invoice.InvoiceItem;

@ProtoAdapter(InvoiceItem.class)
public class InvoiceItemAdapter {

    @ProtoFactory
    InvoiceItem create(final String itemName, final int quantity, final float unitPrice) {

        return InvoiceItem.builder()
                .itemName(itemName)
                .quantity(quantity)
                .unitPrice(unitPrice)
                .build();
    }

    @ProtoField(1)
    String getItemName(final InvoiceItem item) {

        return item.getItemName();
    }

    @ProtoField(number = 2, defaultValue = "0")
    int getQuantity(final InvoiceItem item) {

        return item.getQuantity();
    }

    @ProtoField(number = 3, defaultValue = "0.0")
    float getUnitPrice(final InvoiceItem item) {

        return item.getUnitPrice();
    }
}
