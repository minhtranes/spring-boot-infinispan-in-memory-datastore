package vn.ifa.study.infi.repository;

import javax.annotation.PostConstruct;

import org.infinispan.Cache;
import org.infinispan.manager.EmbeddedCacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;
import vn.ifa.study.infi.model.Invoice;

@Slf4j
@Repository
public class InvoiceRepository {

    @Autowired
    private EmbeddedCacheManager cacheManager;
    private Cache<String, Invoice> cache;

    public Invoice find(final String id) {

        return cache.get(id);
    }

    @PostConstruct
    void initialize() {

        cache = cacheManager.getCache("invoices");
        log.info("Initialize cache {} successfully", "invoices");
    }

    public Invoice save(final Invoice invoice) {

        return cache.put(invoice.getId(), invoice);
    }
}
