package java7;

public class MultipleExceptions {

	public static void main(String[] args) {
		try {
			rethrow("abc");
		} catch (FirstException | SecondException | ThirdException e) {
			// ���¸�ֵ�����ڱ������׳��쳣����Ϊe��final�͵�
			// e = new Exception();
			System.out.println(e.getMessage());
		}
	}

	static void rethrow(String s) throws FirstException, SecondException, ThirdException {
		try {
			if (s.equals("First"))
				throw new FirstException("First");
			else if (s.equals("Second"))
				throw new SecondException("Second");
			else
				throw new ThirdException("Third");
		} catch (Exception e) {
			// ����ĸ�ֵû�����������׳��쳣�����ͼ�鹦�ܣ�����Java 7��������
			// e=new ThirdException();
			throw e;
		}
	}

	static class FirstException extends Exception {

		public FirstException(String msg) {
			super(msg);
		}
	}

	static class SecondException extends Exception {

		public SecondException(String msg) {
			super(msg);
		}
	}

	static class ThirdException extends Exception {

		public ThirdException(String msg) {
			super(msg);
		}
	}

}