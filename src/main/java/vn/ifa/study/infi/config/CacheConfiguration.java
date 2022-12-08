package vn.ifa.study.infi.config;

import java.util.concurrent.TimeUnit;

import org.infinispan.configuration.cache.CacheMode;
import org.infinispan.configuration.cache.ConfigurationBuilder;
import org.infinispan.configuration.global.GlobalConfiguration;
import org.infinispan.configuration.global.GlobalConfigurationBuilder;
import org.infinispan.eviction.EvictionStrategy;
import org.infinispan.persistence.rocksdb.configuration.RocksDBStoreConfigurationBuilder;
import org.infinispan.spring.starter.embedded.InfinispanCacheConfigurer;
import org.infinispan.spring.starter.embedded.InfinispanGlobalConfigurer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfiguration {

    @Bean
    public InfinispanCacheConfigurer cacheConfigurer(@Value("${NODE_ID}") final String nodeId) {

        return manager -> {
            manager.defineConfiguration("invoices", replicatedSyncCacheConfiguration(nodeId));
        };
    }

    @Bean
    InfinispanGlobalConfigurer infinispanGlobalConfigurer() {

        return new InfinispanGlobalConfigurer() {

            @Override
            public GlobalConfiguration getGlobalConfiguration() {

                return GlobalConfigurationBuilder.defaultClusteredBuilder()
                        .build();
            }
        };
    }

    public org.infinispan.configuration.cache.Configuration replicatedSyncCacheConfiguration(final String nodeId) {

        return new ConfigurationBuilder().clustering()
                .cacheMode(CacheMode.DIST_SYNC)
                .memory()
                .maxCount(100)
                .whenFull(EvictionStrategy.REMOVE)
                .expiration()
                .lifespan(5, TimeUnit.MINUTES)
                .encoding()
                .mediaType("application/x-protostream")
                .persistence()
                .addStore(RocksDBStoreConfigurationBuilder.class)
                .location("data/" + nodeId)
                .expiredLocation("expired")
                .statistics()
                .enabled(true)
                .build();
    }
}
