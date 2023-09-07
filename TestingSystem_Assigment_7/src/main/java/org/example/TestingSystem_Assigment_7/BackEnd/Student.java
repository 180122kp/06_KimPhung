package org.example.TestingSystem_Assigment_7.BackEnd;

public class Student {
    private int id;
    private String name;
    private static String college = "Đại học Bách Khoa";
    private float moneyGroup = 0;
    private static int countStudent = 0;
    public static int getCountStudent() {
        return countStudent;
    }
    public float getMoneyGroup() {
        return moneyGroup;
    }
    public void setMoneyGroup(float moneyGroup) {
        this.moneyGroup = moneyGroup;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static String getCollege() {
        return college;
    }

    public static void setCollege(String college) {
        Student.college = college;
    }
    public Student(int id, String name)
    {
        if (countStudent < 7) {
            this.id = id;
            this.name = name;
            countStudent++; // Tăng số lượng đối tượng Student khi khởi tạo mới
        } else {
            System.out.println("Đã đạt đến giới hạn số lượng Student.");
        }
    }
    public void InforStudent()
    {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }
    public static void question1()
    {
        Student[] student1 = new Student[3];
        student1[0] = new Student(1,"Nguyễn Văn A");
        student1[1] = new Student(2, "Nguyễn Văn B");
        student1[2] = new Student(3, "Nguyễn Văn C");
        System.out.println("Thông tin các học sinh: \n");
        for(Student student : student1)
        {
            student.InforStudent();
            System.out.println();
        }
        Student.college = "Đại học Công nghệ";
        for (Student student : student1)
        {
            student.InforStudent();
            System.out.println();
        }
    }
    public static void question2()
    {
        Student[] student1 = new Student[3];
        student1[0] = new Student(1,"Nguyễn Văn A");
        student1[1] = new Student(2, "Nguyễn Văn B");
        student1[2] = new Student(3, "Nguyễn Văn C");
        System.out.println("Thông tin quỹ lớp: \n");
        float money = 0;
        for(Student student : student1)
        {
          money +=  student.moneyGroup + 100;
        }
        System.out.println("Tiền quỹ sau khi nộp: " + money);
        //student thứ 1 lấy 50k
        float money1 = money - 50;
        System.out.println("Tiền quỹ sau khi Student thứ 1 mua bim bim: " + money1);
        float money2 = money1 - 20;
        System.out.println("Tiền quỹ sau khi Student thứ 2 mua bánh mì: " + money2);
        float money3 = money2 - 150;
        System.out.println("Tiền quỹ sau khi Student thứ 3 mua đồ dùng học tập: " + money3);
        for(Student student:student1)
        {
            money3 += student.moneyGroup + 50;
        }
        System.out.println("Tiền quỹ sau khi mỗi người đóng thêm 50k: " + money3);
    }
    public static void changeCollege(String newCollege)
    {
        college = newCollege;
    }
    public static void question6()
    {
        Student[] student1 = new Student[3];
        student1[0] = new Student(1,"Nguyễn Văn A");
        student1[1] = new Student(2, "Nguyễn Văn B");
        student1[2] = new Student(3, "Nguyễn Văn C");
        System.out.println("Số lượng Student đã được tạo: " + countStudent);
    }
}
