package com.xtc.why.mapper;

import com.xtc.why.model.WechatMenu;
import com.xtc.why.model.WechatMenuExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WechatMenuMapper {
    int countByExample(WechatMenuExample example);

    int deleteByExample(WechatMenuExample example);

    int deleteByPrimaryKey(String unid);

    int insert(WechatMenu record);

    int insertSelective(WechatMenu record);

    List<WechatMenu> selectByExampleWithBLOBs(WechatMenuExample example);

    List<WechatMenu> selectByExample(WechatMenuExample example);

    WechatMenu selectByPrimaryKey(String unid);

    int updateByExampleSelective(@Param("record") WechatMenu record, @Param("example") WechatMenuExample example);

    int updateByExampleWithBLOBs(@Param("record") WechatMenu record, @Param("example") WechatMenuExample example);

    int updateByExample(@Param("record") WechatMenu record, @Param("example") WechatMenuExample example);

    int updateByPrimaryKeySelective(WechatMenu record);

    int updateByPrimaryKeyWithBLOBs(WechatMenu record);

    int updateByPrimaryKey(WechatMenu record);
}