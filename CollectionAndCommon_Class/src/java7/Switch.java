package java7;

/*java6֮ǰ��case����еĳ���ֻ����byte,char,short��int(Ҳ���������Ƕ�Ӧ�ķ�װ����Byte,
 * Character,Short��Integer)��ö�ٳ�����java7���ӵ�String,�Ͼ���Ҳ�ǳ�������*/
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key = "����";
		switch (key) {
		case "����":
			System.out.println("����������");
			break;
		case "����":
			System.out.println("����������");
			break;
		default:
			System.out.println("�����������������ڶ���������");
			break;
		}

	}

}
