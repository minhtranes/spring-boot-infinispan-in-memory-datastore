package vn.ifa.study.infi;

import javax.annotation.PostConstruct;

import org.infinispan.Cache;
import org.infinispan.manager.EmbeddedCacheManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Repository
public class InvoiceRepository {

    @Autowired
    private EmbeddedCacheManager cacheManager;
    private Cache<Object, Object> cache;

    @PostConstruct
    void initialize() {

        cache = cacheManager.getCache("invoices");
        log.info("Initialize cache {} successfully", "invoices");
        cache.put("samplekey", "samplevalue");
    }
}
