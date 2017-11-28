package java7;

/*java6之前，case语句中的常量只能是byte,char,short和int(也可以是他们对应的封装类型Byte,
 * Character,Short和Integer)或枚举常量，java7增加的String,毕竟它也是常量类型*/
public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String key = "晴天";
		switch (key) {
		case "晴天":
			System.out.println("今天是晴天");
			break;
		case "阴天":
			System.out.println("今天是阴天");
			break;
		default:
			System.out.println("不管晴天阴天有你在都是艳阳天");
			break;
		}

	}

}
