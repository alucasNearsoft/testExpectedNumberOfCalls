package com.companyname.exercise.classcollab;

public class ClassA {

	private IMethodWithoutReturn classB;
	
	// getter
	public IMethodWithoutReturn getClassB() {
		return classB;
	}

	// setter
	public void setClassB(IMethodWithoutReturn classB) {
		this.classB = classB;
	}

	// this method calls 2 times the method of class B
	public void collaborateWithClassB() { 
		classB.theMethodWithoutReturn(); // 1st call
		classB.theMethodWithoutReturn(); // 2nd call
	}
}
