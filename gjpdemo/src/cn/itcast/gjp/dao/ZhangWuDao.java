package cn.itcast.gjp.dao;

import java.sql.SQLException;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import cn.itcast.gjp.domain.ZhangWu;
import cn.itcast.gjp.tools.JDBCUtils;

public class ZhangWuDao {
	QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
	
	public List<ZhangWu> selectAll() {
		try{
		String sql = "SELECT * FROM gjp_zhangwu";
		List<ZhangWu> list = qr.query(sql, new BeanListHandler<>(ZhangWu.class));
		return list;
		}catch(SQLException ex) {
			throw new RuntimeException("²éÑ¯Êý¾ÝÊ§°Ü");
		}
	}
}
