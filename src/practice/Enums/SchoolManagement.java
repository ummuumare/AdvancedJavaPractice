package practice.Enums;
//Task: Okul yönetimi için student ve teacher silme programını yazınız
//User için role tanımlayın(ADMIN,TEACHER, STUDENT) ve role göre silme yetkisi veriniz.
//student silme yetkisi (ADMIN,TEACHER)
//teacher silme yetkisi ADMIN
public class SchoolManagement {
    public static void main(String[] args) {
        //1 ogretmen ve ogrenci tanimla
        Student student = new Student("Havva");
        Teacher teacher = new Teacher("Necibe");

        //3 kullanici tanimla
        User user1 = new User("Ummu", Role.ROLE_ADMIN);
        User user2 = new User("Umare", Role.ROLE_TEACHER);
        User user3 = new User("Bulut", Role.ROLE_STUDENT);
        deleteStudents(student, user1);
        deleteStudents(student, user2);
        deleteStudents(student, user3);


        deleteTeachers(teacher,user1);
        deleteTeachers(teacher,user2);
        deleteTeachers(teacher,user3);
    }
    //deleteStudent methodunu olustur
    public static void deleteStudents(Student std,User user){
        if(user.getRole().equals(Role.ROLE_ADMIN) || user.getRole().equals(Role.ROLE_TEACHER)){
            System.out.println("Student is deleted successfully by "+ user.getRole().getName());
        } else {
            System.out.println(user.getRole().getName()+" is not permitted to delete students");
        }
    }
    //deleteTeacher methodunu olustur
    public static void deleteTeachers(Teacher teacher,User user){
        if(user.getRole().equals(Role.ROLE_ADMIN)){
            System.out.println("Teacher is deleted successfully by "+ user.getRole().getName());
        } else {
            System.out.println(user.getRole().getName()+" is not permitted to delete teachers");
        }
    }

}
