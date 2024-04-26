package main.java.org.example.utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyser implements IRetryAnalyzer {
    int count = 0;
    int retryCount = 1; //the amount of times it will retry
    @Override
    public boolean retry(ITestResult iTestResult) {
        while (count<retryCount){
            count++;
            return true;
        }
        return false;
    }
}
