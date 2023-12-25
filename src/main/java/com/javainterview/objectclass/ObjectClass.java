package com.javainterview.objectclass;

public class ObjectClass {
	//Parent Class of Object:

		/*In Java, there is no parent class for the Object class. It stands at the very top of the class hierarchy and does not inherit from any other class.
		Methods in the Object Class:

		Object class provides several commonly used methods that are available to all Java objects, including:
		toString(): Returns a string representation of the object.
		equals(Object obj): Compares the object with another for equality.
		hashCode(): Returns a hash code value for the object.
		getClass(): Returns the runtime class of the object.
		clone(): Creates a shallow copy of the object.
		finalize(): Called by the garbage collector before an object is reclaimed.
		wait(), notify(), notifyAll(): Methods for inter-thread communication and synchronization.
*/
	
//	//finalize 
//	/*
//	 * public class Resource { private File file; // Assume this is a resource that
//	 * needs cleanup
//	 * 
//	 * public Resource(String filePath) { this.file = new File(filePath); }
//	 * 
//	 * // Method to perform some operations using the resource
//	 * 
//	 * @Override protected void finalize() throws Throwable { // Cleanup operations
//	 * before the object is garbage collected if (file != null && file.exists()) {
//	 * file.delete(); // Delete the file } super.finalize(); } }
//	 */
	
	}
