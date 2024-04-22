package day08.static_.Quiz;

public class Department {

   private String departmentName; //학과명
   private int studentCount; //학과 학생 수
   private static int totalStudents; //총 학생 수(변하지 않으니까)

   public Department(String departmentName, int studentCount){
       this.departmentName = departmentName;
       this.studentCount = studentCount;
       this.totalStudents += studentCount;
   }

    public void addStudent(int add) {
       this.studentCount+=add;
       totalStudents+=add;
    }

    public int getStudentCount() {
        return this.studentCount;
   }

    public static int getTotalStudents() {
       return totalStudents;
    }


}
