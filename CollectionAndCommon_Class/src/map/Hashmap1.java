package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Hashmap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      HashMap<String , String>map=new HashMap<String,String>();
      //�������ظ���ֵ�����ظ�
      map.put("san", "����");
      map.put("si", "����");
      map.put("wu", "����");
      map.put("wang", "����");
      map.put("wang", "����2");//����������
      map.put("lao", "����");
      System.out.println(map);
      //��ȡMap�е����м�
     /* Set<String> keys=map.keySet();
      for (String key : keys) {
    	  System.out.println(key);
		
	}*/
      //��ȡMap������ֵ
     Collection<String> values = map.values();
     for (String value : values) {
		System.out.println(value);
	}
     //�õ�key��ֵ��ͬʱ�õ�key����Ӧ��ֵ
     System.out.println("�õ�key��ֵ��ͬʱ�õ�key����Ӧ��ֵ");
     Set<String> keys=map.keySet();
     for (String key : keys) {
   	  System.out.println(key+"-"+map.get(key));
		
	}
     System.out.println(map.size());
     System.out.println(map.isEmpty());
     //���ҵ���put(key,value)������ʱ�����Ȼ��key��value��װ��
     //Entry�����̬�ڲ�������У���Entry��������ӵ������У������������ȡ
     //map�е����м�ֵ�ԣ�����ֻҪ��ȡ�����е�����Entry���󣬽�����
     //����Entry�����е�getKey()��getValue()�������ܻ�ȡ��ֵ����
     Set<java.util.Map.Entry<String, String>> entrys=map.entrySet();
     for(java.util.Map.Entry<String, String> entry:entrys){
    	 System.out.println(entry.getKey()+"--"+entry.getValue());
     }
	}

}
