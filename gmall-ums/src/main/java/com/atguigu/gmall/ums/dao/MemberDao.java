package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author shuyijun
 * @email syj@atguigu.com
 * @date 2019-10-29 10:24:06
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}