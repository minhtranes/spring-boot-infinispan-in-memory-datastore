package vn.ifa.study.infi;

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
        private String id;
        private String itemName;
        private int unitPrice;
        private int quantity;
        private String service;

        public int getAmount() {

            return unitPrice * quantity;
        }
    }

    private String id;
    private String guestName;
    private LocalDate checkInDate;
    private LocalDate checkOutDate;
    private String country;
    private String issuer;
    private List<String> rooms;
    private List<InvoiceItem> items;
    private String sheetName;
    private boolean signed;

}
