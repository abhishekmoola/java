//package com.java.accessmodifier;
//
//import lombok.Data;
//
//@Data
//public class ObjectCloning {
//	int age ;
//	int name;
//	public ObjectCloning(ObjectCloning ob) {
//		this.age=ob.age;
//		this.name=ob.name;
//		// TODO Auto-generated constructor stub
//	}
//
//	@Override
//	protected Object clone() throws CloneNotSupportedException {
//		// TODO Auto-generated method stub
//		return super.clone();
//	}
//	
//	public class mainObjectClone {
//		public static void main(String[] args) throws CloneNotSupportedException {
//			ObjectCloning o = new ObjectCloning(1,2);
//			ObjectCloning w = (ObjectCloning) o.clone();
//			
//		}
//			
//		}
//}
