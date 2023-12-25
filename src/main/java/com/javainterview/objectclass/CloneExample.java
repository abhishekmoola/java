package com.javainterview.objectclass;

//clone 
	// it will create the shallow of the object it won't effect an original one 
	 

public class CloneExample {
	
		private int age;
		private int number;
		
	   public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public int getNumber() {
			return number;
		}


		public void setNumber(int number) {
			this.number = number;
		}


	public CloneExample(int i, int j) {
			this.age=age;
			this.number=number;// TODO Auto-generated constructor stub
		}
	@Override
	protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
	}
	
	 public static void main(String[] args)   {
			
			CloneExample copyClone;
			try {
				CloneExample c = new CloneExample(0, 0);
				copyClone = (CloneExample) c.clone();
				copyClone.setAge(1);
				System.out.println(copyClone.getAge());
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//System.out.println(c.getAge());
		}
}
