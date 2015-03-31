package edu.bupt.zyq;

public class MultiplyStrings {

	/**
	 * Given two numbers represented as strings, return multiplication of the numbers as a string.

Note: The numbers can be arbitrarily large and are non-negative.
	 * */
	
	public static  String multiply(String num1, String num2) {
		//ת���ɼӷ�����
		if(num1 == null || num2 == null || num1.length() == 0 || num1.length() == 0) return null;
		StringBuilder reBuilder = null;
		StringBuilder tempBuilder = new StringBuilder();
		int carry = 0;
		for(int i = num1.length() - 1; i >= 0; i--){
			for(int j = num2.length() - 1; j >= 0; j--){
				int temp = (num2.charAt(j) - '0') * (num1.charAt(i) - '0');
				tempBuilder.insert(0, (carry + temp) % 10);
				carry = (temp + carry)/10;
			}
			if(carry > 0)
				tempBuilder.insert(0, carry);
			carry = 0;
			reBuilder = plus(reBuilder, tempBuilder, num1.length() - i - 1);
			tempBuilder.delete(0, tempBuilder.length());
		}
		while(reBuilder.length() > 1 && reBuilder.charAt(0) == '0'){//ɾ�����мӷ�����ʱǰ�油�ĵ�û���õ���0
			reBuilder.deleteCharAt(0);
		}
       return reBuilder.toString();
    }
	
	public static StringBuilder plus(StringBuilder sb1, StringBuilder sb2, int offset){
		//�ӷ����㣬����ǰ�˲�0�İ취��������λ�������Ҳ����
		if(sb1 == null){
			sb1 = new StringBuilder();
			sb1.append(sb2);
		}else{
			if(sb1.length() < sb2.length() + offset){//ǰ�油0
				while( 0 < sb2.length() + offset - sb1.length()){//��Ҫ:sb1.length()��仯,�����ñ�ʾ��
					sb1.insert(0, '0');
				}
			}
			int carry = 0, tempSum;
			for(int j = sb2.length() - 1; j >= 0; j--){
				tempSum = sb1.charAt(j) - '0' + sb2.charAt(j) - '0';
				sb1.setCharAt(j, (char) (((tempSum + carry) % 10) + '0'));
				carry = (carry + tempSum) / 10;
			}
			if(carry > 0)
				sb1.insert(0, carry);
		}
		return sb1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("what: " + multiply("5","408"));
	}

}
