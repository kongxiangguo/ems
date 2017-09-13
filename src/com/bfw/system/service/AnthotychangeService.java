package com.bfw.system.service;

import java.util.List;

import com.bfw.po.RoleAnthorityInfo;

/**
 * 权限变更的业务逻辑接口
 * @author 老牛
 * 2014年11月17日
 *
 */
public interface AnthotychangeService {

	/**
	 * 添加角色权限信息
	 * @param roleId
	 * @param anthortyId
	 * @throws Exception
	 */
	public void add(Integer roleId,Integer[] anthortyId)throws Exception;
	
	/**
	 * 查询角色权限信息
	 * @param roleAnthorityInfo
	 * @return
	 */
	public List<RoleAnthorityInfo>  getRoleAnthorityList(RoleAnthorityInfo roleAnthorityInfo);
}
