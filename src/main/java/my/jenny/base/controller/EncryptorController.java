package my.jenny.base.controller;

import org.jasypt.encryption.StringEncryptor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
* @description 加密器
* @author wanggc
* @date 2020/11/6 11:27 上午
*/
@RestController
@RequestMapping(value = "/encryptor")
public class EncryptorController {

    @Resource
    private StringEncryptor jasyptStringEncryptor;

    /**
     * 加密
     * @param plaintext 明文
     * @return 密文
     */
    @RequestMapping(value = "/encrypt")
    public String encrypt(String plaintext) {
        return jasyptStringEncryptor.encrypt(plaintext);
    }
}
