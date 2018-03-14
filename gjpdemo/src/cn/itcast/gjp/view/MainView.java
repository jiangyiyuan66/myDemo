package cn.itcast.gjp.view;

import java.util.List;
import java.util.Scanner;

import cn.itcast.controller.ZhangWuController;
import cn.itcast.gjp.domain.ZhangWu;

public class MainView {
	private ZhangWuController zhangWuController = new ZhangWuController();

	public void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("---------------管家婆家庭记账软件---------------");
			System.out.println("1.添加账务　2.编辑账务　3.删除账务　4.查询账务　5.退出系统");
			System.out.println("请输入要操作的功能序号[1-5]:");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				// 查询账务
				selectZhangWu();
				break;
			case 5:
				System.out.println("谢谢你的使用");
				System.exit(0);
			default:
				System.out.println("输入错误！");
			}
		}
	}

	public void selectZhangWu() {
		System.out.println("1.查询所有　2.按条件查询");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		switch (num) {
		case 1:
			selectAll();
			break;
		case 2:
			select();
			break;
		default:
			System.out.println("输入错误！");
		}
	}

	private void select() {
	}

	private void selectAll() {
		List<ZhangWu> list = zhangWuController.selectAll();
		System.out.println("ID\t类别\t\t账户\t\t金额\t\t时间\t\t说明");
		for (ZhangWu z : list) {
			System.out.println(z.getZwid()+"\t"+z.getFlname()+"\t\t"+z.getZhanghu()+"\t\t"+z.getMoney()+"\t\t"+z.getCreatetime()+"\t"+z.getDescription());
		}
		
	}
}
