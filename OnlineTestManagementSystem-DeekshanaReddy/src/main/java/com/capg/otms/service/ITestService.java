package com.capg.otms.service;


import java.util.List;

import com.capg.otms.entity.TestBean;
public interface ITestService {
	public TestBean addTest(TestBean bean );
	public void removeTest(int testId );
	public List<TestBean>getAllTests();
}



