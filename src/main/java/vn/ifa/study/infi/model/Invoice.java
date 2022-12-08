package vn.ifa.study.infi.model;

import java.time.LocalDate;
import java.util.List;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Invoice {

    @Setter
    @Getter
    @Builder
    public static class InvoiceItem {
        private String itemName;
        private int quantity;
        private float unitPrice;
    }

    private String id;

    private String customerName;

    private LocalDate issuedDate;

    private List<InvoiceItem> items;
}
