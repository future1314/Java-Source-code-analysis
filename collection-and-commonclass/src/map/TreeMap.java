package map;

import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;

public class TreeMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.TreeMap<String, String> tmap = new java.util.TreeMap<String, String>();
		tmap.put("san", "����");
		tmap.put("si", "����");
		tmap.put("wu", "����");
		tmap.put("hong", "С��");
		tmap.put("li", "С��");
		// tmap.put("null", "С��");
		tmap.remove("san");
		System.out.println(tmap);
		Date date = new Date();
		System.out.println(date);
	}
}
