package vn.ifa.study.infi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import vn.ifa.study.infi.model.Invoice;
import vn.ifa.study.infi.repository.InvoiceRepository;

@RestController
@RequestMapping("api/invoices")
public class InvoiceController {

    @Autowired
    private InvoiceRepository invoiceRepository;

    @GetMapping("/{id}")
    public Invoice get(@PathVariable(name = "id", required = true) final String id) {

        return invoiceRepository.find(id);
    }

    @PostMapping
    public Invoice set(@RequestBody final Invoice invoice) {

        return invoiceRepository.save(invoice);
    }
}
