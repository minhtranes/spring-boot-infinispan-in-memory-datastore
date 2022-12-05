package vn.ifa.study.infi;

import org.springframework.context.annotation.Configuration;

@Configuration
public class CacheConfiguration {

//    @Bean
//    InfinispanCacheConfigurer cacheConfigurer() {
//
//        return manager -> {
//            final org.infinispan.configuration.cache.Configuration ispnConfig = new ConfigurationBuilder().clustering()
//                    .cacheMode(CacheMode.REPL_SYNC)
//                    .hash()
//                    .numOwners(1)
//                    .numSegments(100)
//                    .capacityFactor(2)
//                    .memory()
//                    .whenFull(EvictionStrategy.REMOVE)
//                    .maxCount(20)
//                    .build();
//
//            manager.defineConfiguration("invoices", ispnConfig);
//        };
//    }
//
//    @Bean
//    InfinispanGlobalConfigurationCustomizer cssadasdadsa() {
//
//        return config -> {
//            config.transport()
//                    .defaultTransport()
//                    .build();
//        };
//    }

//    @Bean
//    GlobalConfiguration globalConfigurer() {
//
//        return GlobalConfigurationBuilder.defaultClusteredBuilder()
//                .transport()
//                .clusterName("infini-dev")
//                .build();
//    }
}
