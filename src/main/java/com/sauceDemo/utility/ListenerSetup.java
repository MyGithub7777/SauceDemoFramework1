package com.sauceDemo.utility;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.sauceDemo.testBase.TestBase;

public class ListenerSetup extends TestBase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		logger.info("Test Execution Started "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.info("Test Execution Completed "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		logger.info("Test Execution Failed "+result.getName());
		CommonUtils.takeScreenshotOfWebpage(result.getName());
		logger.info("Screenshot Captured");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.info("Test Execution Skipped");
	}
}
