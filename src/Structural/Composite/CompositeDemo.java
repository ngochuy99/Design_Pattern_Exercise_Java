package Structural.Composite;

public class CompositeDemo {
    public static void main(String[] args) {
        Employee CEO = new Employee("John","CEO",30000);
        Employee headSales = new Employee("Robert","HeadSales",20000);
        Employee headMarketing = new Employee("Micheal","head Marketing",10000);
        Employee clerk1 = new Employee("cleark 1","clerk",5000);
        Employee saleExecutive = new Employee("sale executive","sale executive",5000);
        CEO.add(headMarketing);
        CEO.add(headSales);
        headSales.add(clerk1);
        headSales.add(saleExecutive);
        System.out.println(CEO);
        for(Employee headEmployee: CEO.getSubordinates()){
            System.out.println(headEmployee);
            for(Employee employee:headEmployee.getSubordinates()){
                System.out.println(employee);
            }
        }

    }
}
