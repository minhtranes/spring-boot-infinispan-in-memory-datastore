package vn.ifa.study.infi.config;

import java.net.InetAddress;
import java.net.UnknownHostException;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public final class EnvUtil {
    public static final String getHostname() {

        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            return inetAddress.getHostName();
        }
        catch (UnknownHostException e) {
            log.error("Failed to get hostname", e);
        }

        return null;
    }

    private EnvUtil() {

    }
}
