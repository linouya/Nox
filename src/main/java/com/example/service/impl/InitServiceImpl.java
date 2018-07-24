package com.example.service.impl;

import com.example.service.InitService;
import org.springframework.stereotype.Service;
import org.web3j.protocol.Web3j;
import org.web3j.protocol.core.methods.response.Web3ClientVersion;
import org.web3j.protocol.http.HttpService;

import java.io.IOException;

/**
 * @program: nox
 * @description: 初始
 * @author: loy
 * @create: 2018-07-23 14:35
 **/
@Service
public class InitServiceImpl implements InitService {


    @Override
    public String test() throws IOException {
//
//        Web3j web3 = Web3j.build(new HttpService());  // 默认 http://localhost:8545/
//        Web3ClientVersion web3ClientVersion = web3.web3ClientVersion().send();
//        String clientVersion = web3ClientVersion.getWeb3ClientVersion();

        return "hello";
    }

}
