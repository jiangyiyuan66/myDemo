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
			System.out.println("---------------�ܼ��ż�ͥ�������---------------");
			System.out.println("1.�������2.�༭����3.ɾ������4.��ѯ����5.�˳�ϵͳ");
			System.out.println("������Ҫ�����Ĺ������[1-5]:");
			int num = sc.nextInt();
			switch (num) {
			case 1:
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				// ��ѯ����
				selectZhangWu();
				break;
			case 5:
				System.out.println("лл���ʹ��");
				System.exit(0);
			default:
				System.out.println("�������");
			}
		}
	}

	public void selectZhangWu() {
		System.out.println("1.��ѯ���С�2.��������ѯ");
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
			System.out.println("�������");
		}
	}

	private void select() {
	}

	private void selectAll() {
		List<ZhangWu> list = zhangWuController.selectAll();
		System.out.println("ID\t���\t\t�˻�\t\t���\t\tʱ��\t\t˵��");
		for (ZhangWu z : list) {
			System.out.println(z.getZwid()+"\t"+z.getFlname()+"\t\t"+z.getZhanghu()+"\t\t"+z.getMoney()+"\t\t"+z.getCreatetime()+"\t"+z.getDescription());
		}
		
	}
}
