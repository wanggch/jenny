package my.jenny.base.config;

import org.jasypt.encryption.StringEncryptor;
import org.jasypt.encryption.pbe.PooledPBEStringEncryptor;
import org.jasypt.encryption.pbe.config.SimpleStringPBEConfig;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
* @description 
* @author wanggc
* @date 2020/11/6 11:39 上午
*/
@Configuration
public class SecurityConfig {

    /**
     * Jasypt string encryptor to encrypt/decrypt properties
     * @return String encryptor bean
     */
    @Bean
    @ConditionalOnMissingBean
    public StringEncryptor jasyptStringEncryptor() {
        PooledPBEStringEncryptor encryptor = new PooledPBEStringEncryptor();
        SimpleStringPBEConfig config = encryptorConfig();
        config.setPassword("MyHoney");
        encryptor.setConfig(config);
        return encryptor;
    }

    /**
     * Jasypt string encriptor configuration
     * @return Encryptor configuration
     */
    @Bean
    @Scope("prototype")
    @ConditionalOnMissingBean
    public SimpleStringPBEConfig encryptorConfig() {
        SimpleStringPBEConfig config = new SimpleStringPBEConfig();
        config.setAlgorithm("PBEWithMD5AndDES");
        config.setKeyObtentionIterations("1000");
        config.setPoolSize("1");
        config.setProviderName("SunJCE");
        config.setSaltGeneratorClassName("org.jasypt.salt.RandomSaltGenerator");
        config.setStringOutputType("base64");
        return config;
    }
}