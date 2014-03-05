package com.companyname.exercise.test;

import org.easymock.EasyMock;
import org.junit.Test;

import com.companyname.exercise.classcollab.ClassA;
import com.companyname.exercise.classcollab.IMethodWithoutReturn;

public class TestClassesColaboration {

	@Test
	public void test() {
		ClassA classA = new ClassA();
		IMethodWithoutReturn mock = EasyMock.createMock(IMethodWithoutReturn.class);
		// this is the expected behavior of the mock ...
		mock.theMethodWithoutReturn(); // ... that the method be called
		EasyMock.expectLastCall().times(3); // in this case the method call is expected to be called 3 times
		EasyMock.replay(mock);
		
		// this is the use of the mock
		classA.setClassB(mock);
		classA.collaborateWithClassB(); // when we use the mock, in this method the call to the method is done just 2 times
		
		// this is the verification
		EasyMock.verify(mock); // and this will fail, due to it was expected the method were called 3 times but actually is called 2 times
	}
}
