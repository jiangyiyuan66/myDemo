package cn.itcast.gjp.service;

import java.util.List;

import cn.itcast.gjp.dao.ZhangWuDao;
import cn.itcast.gjp.domain.ZhangWu;

public class ZhangWuService {
	private ZhangWuDao zhangWuDao = new ZhangWuDao();
	
	public List<ZhangWu> selectAll() {
		return zhangWuDao.selectAll();
	}
}
