package praktikum.pbo.application;
import praktikum.pbo.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Praktikum PBO");

        Company.Employee employee = company.new Employee();
        employee.setName("Hans");

        System.out.println("\nEmployee: " + employee.getName());
        System.out.println("Company: " + employee.getCompany());

        Company company2 = new Company();
        company2.setName("Hololive");

        Company.Employee employee2 = company2.new Employee();
        employee2.setName("A-chan");

        System.out.println("\nEmployee: " + employee2.getName());
        System.out.println("Company: " + employee2.getCompany());
    }
}
