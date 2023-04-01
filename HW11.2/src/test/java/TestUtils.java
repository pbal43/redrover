import jdk.jfr.StackTrace;
import org.example.Employee_2;
import org.example.Manager_2;
import org.example.Utils;
import org.testng.Assert;
import org.testng.annotations.Test;



public class TestUtils {

    public static class data {
        static Employee_2 employee2_1 = new Employee_2();
        static Employee_2 employee2_2 = new Employee_2();
        static Employee_2 employee2_3 = new Employee_2();

        public static void naming() {
            employee2_1.setName("Valik");
            employee2_2.setName("Dranik");
            employee2_3.setName("Pryanik");
        }

        public static void salaring() {
            employee2_1.setBaseSalary(100.0);
            employee2_2.setBaseSalary(200.0);
            employee2_3.setBaseSalary(101.0);
            manager2_1.setBaseSalary(100.0);
            manager2_2.setBaseSalary(200.0);
            manager2_3.setBaseSalary(101.0);
        }

        static Employee_2[] employeeArray = {employee2_1, employee2_2, employee2_3};


        static Manager_2 manager2_1 = new Manager_2();
        static Manager_2 manager2_2 = new Manager_2();
        static Manager_2 manager2_3 = new Manager_2();

        static Manager_2[] managerArray = {manager2_1, manager2_2, manager2_3};

        public static void subordinating() {

            manager2_1.setNumberOfSubordinates(2);
            manager2_2.setNumberOfSubordinates(5);
            manager2_3.setNumberOfSubordinates(7);
        }

//        public static void incoming() {
//            manager2_1.getSalaryManager();
//            manager2_2.getSalaryManager();
//            manager2_3.getSalaryManager();
//            }
    }

    // изучить про передачу переменных из другого класса

    @Test
    public void searchByNameTest() {
        data.naming();
        Assert.assertEquals(Utils.searchByName(data.employeeArray, "dranik"), data.employee2_2);
    }

    @Test
    public void searchBySubstringTest() {
        data.naming();
        Assert.assertEquals(Utils.searchBySubstring(data.employeeArray, "ik"), data.employee2_1);
    }

    @Test
    public void searchBySubstringAllTest() {
        data.naming();
        Assert.assertEquals(Utils.searchBySubstringAll(data.employeeArray, "ik"), data.employeeArray);
    }

    @Test
    public void calculateSalaryTest() {
        data.salaring();
        Assert.assertEquals(Utils.calculateSalary(data.employeeArray, null, null), 401.0);
    }

    @Test
    public void searchMinSalaryTest() {
        data.salaring();
        Assert.assertEquals(Utils.searchMinSalary(data.employeeArray), 100.0);
    }

    @Test
    public void searchMaxSalaryTest() {
        data.salaring();
        Assert.assertEquals(Utils.searchMaxSalary(data.employeeArray), 200.0);
    }

    @Test
    public void searchMinNumberOfSubordinatesTest() {
        data.subordinating();
        Assert.assertEquals(Utils.searchMinNumberOfSubordinates(data.managerArray), 2);
    }

    @Test
    public void searchNumberOfSubordinatesTest() {
        data.subordinating();
        Assert.assertEquals(Utils.searchNumberOfSubordinates(data.managerArray), 7);
    }

    @Test
    public void calculateMaxExtraIncomeTest() {
        data.salaring();
        data.subordinating();
        Assert.assertEquals(Utils.calculateMaxExtraIncome(data.managerArray), data.manager2_2.getSalaryManager() - data.manager2_2.getBaseSalary()); // мб стоит отдельно высчитать и проверить extra_income
    }

    @Test
    public void calculateMinExtraIncomeTest() {
        data.salaring();
        data.subordinating();
        Assert.assertEquals(Utils.calculateMinExtraIncome(data.managerArray), data.manager2_1.getSalaryManager() - data.manager2_1.getBaseSalary());

    }

}
