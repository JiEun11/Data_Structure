package com.javaex.structure.first.practice1;

/*
�߻� Ŭ����
1. ���� ����� �������� ���.
2. �߻� Ŭ������ ��ӹ޴� sub class�� ������ �߻�޼ҵ带 �������̵� �ؾ��Ѵ�.
	���� ���� ��� �߻�Ŭ����ȭ �Ǽ� ��ü�� ������ �� ����.
3. �߻�޼ҵ�� �������� �����ϱ� ������ �� �������̵� �ؾ߸� �Ѵ�.

4. �߻�Ŭ���� ���� �� �߻�ȭ �� ���� interface �̴�.

5. �߻�޼ҵ�, ����� ���°� ��Ģ
6. �������̽��� ���� ����� ����Ѵ�. (��ȣ���� �߻����� �ʴ´�.)
7. ���߻���� ��ü�ϱ� ���� ����� ����.


*/
interface ss{
	//���, �߻�޼ҵ�
	
	final static int num = 10;  //�����..
	abstract void disp();
}

interface sss extends ss{
	//���, �߻�޼ҵ�
	
	final static int num = 10;  //�����..
	abstract void disp();
}

interface ssss extends ss, sss{
	//���, �߻�޼ҵ�
	
	final static int num = 10;  //�����..
	abstract void disp();
}

class First implements ssss{

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
	
}