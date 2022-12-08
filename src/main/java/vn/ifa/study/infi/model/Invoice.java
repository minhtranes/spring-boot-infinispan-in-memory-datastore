package vn.ifa.study.infi.model;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
public class Invoice {

    private String id;

    private String customerName;

    private LocalDate issuedDate;

}
