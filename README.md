# frameworkjava
1. Created the maven project
2. Added dependencies at the pom.xml Maven, Selenium, testNG, AventStack(for extend reporting).
3. Add 3 folders: one for the drivers, one for screenshots, one to genreate Reports.
4. Add the testng.xml file where we will be running the tests.
5. Will be doing a POM, each page will have its own class
6. Add three packages at the main java folder.
7. PageEvents: will be having different classes for different pages and will be operating on those
8. PageObjecta: will contain all the identifiers xpaths, id ...
9. Utils: everything that we will use across the project will be insterted inside this package
10. Create the BaseTest class inside the test/java folder
11. Start coding: create the annotations before/after
12. Add the methods
13. Create the webdriver
14. Initialize it at the beforemethod
15. Quit the driver after the AfterMethod
16. Create a common method to setup the driver
17. Call the setupmethod at the BeforeMethod method and give a parameter that will get the browser from the testng file
18. Create a constant interface at the utils package
19. Add the url constant as a string and get the url through constans at the BaseTest file
20. Add the code to initialize the report
21. Also at the BeforeTest
22. Create the SuiteListerner class and implement the iTestListener
23. Create the RetryAnalyzer class that implements IRetryAnalyzer and add the code to count the retry after a failed test
24. On the SuiteListener class implement the IAnnotationTransformer and its method to call the RetryAnalyzer
25. Create the ElementFetch class
