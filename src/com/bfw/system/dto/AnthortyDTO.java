package com.bfw.system.dto;

import java.util.List;

import com.bfw.po.AnthortyInfo;

/**
 * 权限变更的数据传输对象
 * 
 * @author 老牛 2014年11月17日
 *
 */
public class AnthortyDTO {

	/**
	 * 一级菜单
	 */
	private AnthortyInfo anth;

	/**
	 * 多个子菜单
	 */
	private List<AnthortyInfo> list;

	public AnthortyInfo getAnth() {
		return anth;
	}

	public void setAnth(AnthortyInfo anth) {
		this.anth = anth;
	}

	public List<AnthortyInfo> getList() {
		return list;
	}

	public void setList(List<AnthortyInfo> list) {
		this.list = list;
	}

}
