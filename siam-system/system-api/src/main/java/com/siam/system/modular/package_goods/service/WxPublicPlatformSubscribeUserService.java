package com.siam.system.modular.package_goods.service;

import com.siam.system.modular.package_goods.entity.WxPublicPlatformSubscribeUser;
import com.siam.system.modular.package_goods.model.example.WxPublicPlatformSubscribeUserExample;

import java.util.List;

/**
 * jianyang
 */
public interface WxPublicPlatformSubscribeUserService {

    int countByExample(WxPublicPlatformSubscribeUserExample example);

    void deleteByPrimaryKey(Integer id);

    void insertSelective(WxPublicPlatformSubscribeUser wxPublicPlatformSubscribeUser);

    WxPublicPlatformSubscribeUser selectByPrimaryKey(Integer id);

    void updateByPrimaryKeySelective(WxPublicPlatformSubscribeUser wxPublicPlatformSubscribeUser);

    List<WxPublicPlatformSubscribeUser> selectByExample(WxPublicPlatformSubscribeUserExample example);

}
