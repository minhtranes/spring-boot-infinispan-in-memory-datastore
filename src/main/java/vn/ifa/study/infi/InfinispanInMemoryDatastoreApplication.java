package vn.ifa.study.infi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableMBeanExport;

import vn.ifa.study.infi.config.EnvUtil;

@EnableMBeanExport
@SpringBootApplication
public class InfinispanInMemoryDatastoreApplication {

    public static final String SYSTEM_VARIABLE_NODE_ID = "NODE_ID";

    public static void main(final String[] args) {

        String hostname = System.getenv(SYSTEM_VARIABLE_NODE_ID);
        hostname = (hostname != null) && !hostname.isEmpty() ? hostname : EnvUtil.getHostname();
        System.setProperty(SYSTEM_VARIABLE_NODE_ID, hostname);

        SpringApplication.run(InfinispanInMemoryDatastoreApplication.class, args);
    }

}
