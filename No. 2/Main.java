public class Main {
    public static void main(String[] args) {
        Person person = new Person("Wiche", "Jalan Baru", "01234567", "ww@egmail.com");
        Student student = new Student("Gita", "Jalan Air", "09287512", "agp@egmail.com", Student.SENIOR);
        MyDate dateHired = new MyDate(2020, 5, 1);
        Employee employee = new Employee("Della", "Jalan Kelelawar", "07825416", "dellapr@gmail.com", "Room 101", 50000, dateHired);
        Faculty faculty = new Faculty("Niswa", "Jalan Mawar", "019287534", "niswa12@gmail.com", "Room 202", 70000, dateHired, 10, "Professor");
        Staff staff = new Staff("Salma", "Jalan Budi", "015263849", "apis@gmail.com", "Room 303", 40000, dateHired, "Manager");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
}