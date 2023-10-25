import org.example.Employee;
import org.example.Main;
import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;

import static java.lang.String.*;
import static org.hamcrest.MatcherAssert.assertThat;

public class TestPack {
    private List<org.example.Employee> Employee;

    @org.junit.jupiter.api.Test
    public void testConcat_validArgument_success() {
        Assertions.assertNotNull(Main.listToJson(Employee));
    }

    @org.junit.jupiter.api.Test
    public void testConcat_fileCreated() {
        Assertions.assertNotNull(Main.writeFile("Test", "Test_file"));
    }

    @org.junit.jupiter.api.Test
    public void testConcat_notEmptyList() throws IOException, ParserConfigurationException, SAXException {
        List<Employee> testExample = Main.parseXML("data.xml");
        boolean testCondition = testExample.isEmpty();
        assertThat(valueOf(testCondition), true);
    }

    @Test
    public void test2_notEmptyList() {
        String actual = Main.listToJson(Employee);
        Assert.assertThat(actual, Matchers.not(" "));
    }

    @Test
    public void test2_validArgument() throws IOException, ParserConfigurationException, SAXException {
        Assert.assertThat(Main.parseXML("data.xml"), Matchers.notNullValue());
    }

    @Test
    public void test2_fileCreated() {
        var testFile = Main.writeFile("Test2", "Test2_file");
        Assert.assertThat(testFile, Matchers.notNullValue());
    }
    @Test
    public void listTest(){
        String json = Main.writeFile("json", "Test_list.txt");


    }
    @Test
    public void employeeTest(){
        Employee employee = new Employee(23, "Li", "Wong", "CHN", 23);
        Assertions.assertTrue(employee.age > 0);
    }

    @Test
    public void testOfParameters(){
        Employee employee = new Employee(23, "Li", "Wong", "CHN", 23);
        assertThat("id", Matchers.notNullValue());
    }
}


