package cn.itcast.controller;

import java.util.List;

import cn.itcast.gjp.domain.ZhangWu;
import cn.itcast.gjp.service.ZhangWuService;

public class ZhangWuController {
	private ZhangWuService zhangWuService = new ZhangWuService();
	
	public List<ZhangWu> selectAll() {
		return zhangWuService.selectAll();
	}
}
