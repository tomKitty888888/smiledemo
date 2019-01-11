package com.zoloz.smilepay.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by bruce on 2018/6/15.
 */

public class MerchantInfo {
    //这里三个值请填写自己真实的值
    //应用的签名私钥
    public final static String appKey = "MIIEowIBAAKCAQEAsySEYFZfh/FNup/NTKfIrqF3eM8k5Bz+SUO3ZD/LepVTdlJWb3eZ0CHHVmuUGP+lujqWNfSrKA1kfKFO4Zr41GtL8rV4WIUfszjxBUpd5ZqnWHMmZJRdAXvAf7GNtP1pQY3ZLAmRFkIcmQleieZOOPgcXFR8wXtttm2cDzeigVTpu8dwKu7vKgd/tbDSJ1RhFTQ/TacAa1kY2FAybzNvTi35pLYr16zkdPo1RKFaCuh+bh10eAHeQRAjbj+2VLO6SNX+DHDvcLERk5Uui4gcOogruaQ0vjNQA6wbKRq33OpC4QsduR8QRB3DjSWUEtv5C5DsBCWBqPHXhH00PWRm1QIDAQABAoIBABlmOA6gsHLJ18d6GNWhhGaeJh5O4GAnbDZfD4V7NhJvUaIZEoBDaN+FqomqPxk8Rfcdj2afBhVrsK+q/1AldNpJTD9hU2rZlSEIFcQ2QxHm14tG6E6ian1nWmfAeOMMevv8bKo9wQBy5zMbjPfoW3bgVsUQhY+5PFj9OX8+2B+V+aXuvhI1NVn+383g2J0eTYi30yo/9B4jx0XdC8JzvPJCQqcXDqVfrdS2dc9lOuYTBQuW09k83ZLL0LmTfbvUzj9TVcH7JA1uR8QcaFkZn9AC1WZVQhZtznNYuBqbV9LPjQ0R+5c5DlVzxC0Wz4TDBoqADNcDoBrm/tfKteYTZ5ECgYEA49kGKDJnX3WlqaXJsafuWZ+1zd0Iah/r94PnIzenM9AZ9cGP0X41DJ/G2kENsai9EkFXVD6g6XZZ1qZJlIb8Ht+/9Tb84UOQKpuLU5FSNTheDXRI8ehce69OJLcHuQ5801DWRejEeJeh7t+DjtRcmcELC9Q2vjoTGkBgS7weuuMCgYEAyUbrDDcIuwk7U3OeNuy/xV1SecIVUelZXXR4cWvMKpOW6RIousO/076Z4mbJCuxrsdxwn9YtTdg6jlAqYw/g/GKKYNllV6pdQpdi4t7Td3BLQBImPf66Jw9LBeR6vS03/dFAndByPjsHFOcTgxtiE97k42isjlsrK/FO5LyGbOcCgYEAw0SteCmqWi9TaM8CylSnevvbLbDukzUEX74ViyMZEtiYRvw6K0pEYKtWGpqCB+4bC9gf5b0+3pZlbAZbLQV6cWNE+fzEQLJMjZd8koQKtj22rUUpdtiy2fVlvSV3Yuu9osS2vnc8WjVpvHSmJPRu3/6HXv3iZKkU0fy2CnIQzA0CgYBhQjeJ6334gvl71b554+S2xeV4mGQc9JkOI52fkOtTF4YwkWnE9ZnYA53wXKKA+MUBaPezBJdXqkiBRBN3UtDwo90h92qU9emip+xMnEeqy0RRbXO1OUVSYn1qF4GHsDYCG/8RQwwxLey6GP7At5ao62fGy2m2UC+ISE5LER4TuQKBgDfa3dG/DiYa3TLCtASMxMS2Pzt7rLAXKY1PLtF0DwEosff6Y9nZb1gHQkfHopxd12R8wrI/0B9GiwrbIWC+qIcgtLr2vgWnABI1FuO5yanlICEa0NlxG3GHFDyrFy2+jTc8CPu/0phRiQZCB7Ef7YDyXucTmob8zHp6xDHqGFvT";
    //商户id
    public final static String partnerId = "2088102176547564";
    //应用的appId
    public final static String appId = "2019010962845588";
    //支付宝公钥
    public final static String alipayPublicKey = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAmP0PIq46Q56MM1j/ILTCPXuorY40LJNcbVl/0PPDJbOOWhJ8vSA7MmaXcm2T6Osh4GXrAKeDBANhElNPjmr/IH7CkSUJBH7HlZPa7GOVsdq1y/CRhSGu9fFUHxtdjybVMym+IpVGMFe1v3FSsX7qUT72+pmcX655/Sis1VQ0e+6OMTr2zksJfE15OW7AOHtev1reorVfvJReNivWPuxpcOfxrGZ6ZDQqyR4LWBcUQfCjybiqYCjFU/vlo3GupzZ2fRAImXgCWpx/M4d8ZXYTNiTmyHJ/TnmhLoD39qNxpSpV07aW09elC7qOl1EYnIXTRl+bFSRanuae7TVf6KFyrwIDAQAB";
    /**
     * mock数据，真实商户请填写真实信息.
     */
    public static Map mockInfo() {
        Map merchantInfo = new HashMap();
        //以下信息请根据真实情况填写
        //商户id
        merchantInfo.put("partnerId", partnerId);
        merchantInfo.put("merchantId", partnerId);
        //开放平台注册的appid
        merchantInfo.put("appId", appId);
        //机具编号，便于关联商家管理的机具
        merchantInfo.put("deviceNum", "TEST_ZOLOZ_TEST");
        //真实店铺号
        merchantInfo.put("storeCode", "TEST");
        //口碑店铺号
        merchantInfo.put("alipayStoreCode", "TEST");
        //品牌，传入拼音或者英文，标示该商家
        merchantInfo.put("brandCode", "TEST");

        merchantInfo.put("areaCode", "TEST");
        merchantInfo.put("geo", "0.000000,0.000000");
        merchantInfo.put("wifiMac", "TEST");
        merchantInfo.put("wifiName", "TEST");
        merchantInfo.put("deviceMac", "TEST");

        return merchantInfo;
    }
}
