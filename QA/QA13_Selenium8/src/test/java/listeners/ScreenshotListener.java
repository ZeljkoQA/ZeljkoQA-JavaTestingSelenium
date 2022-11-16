package listeners;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import tests.BaseTest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;

public class ScreenshotListener implements ITestListener {

    @Override
    public void onTestFailure(ITestResult result){
        Object currentClass = result.getInstance();
        WebDriver driver = ((BaseTest) currentClass).getDriver();

        if (driver != null){
            Calendar calendar = Calendar.getInstance();
            SimpleDateFormat formater = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");

            File tempFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            File saveFile = new File("lib/errorScreenshots/" + result.getName() + "_"
                                    + formater.format(calendar.getTime()) + "-"
                                    + Arrays.toString(result.getParameters()) + ".jpg");

            try{
                FileUtils.copyFile(tempFile, saveFile);
            } catch(IOException e){
                e.printStackTrace();
            }
        }
        else System.out.println("Screenshot failed due to driver lost in parallel execution");
    }
}
