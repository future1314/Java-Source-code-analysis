package map;

import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.TreeMap<String, String> tmap = new java.util.TreeMap<String, String>();
		tmap.put("san", "张三");
		tmap.put("si", "李四");
		tmap.put("wu", "王五");
		tmap.put("hong", "小红");
		tmap.put("li", "小丽");
		// tmap.put("null", "小丽");
		tmap.remove("san");
		System.out.println(tmap);
		Date date = new Date();
		System.out.println(date);
	}
}
