package practice.generics.interfaces;

public class StudentRepo implements Repository<Student>{


    @Override
    public void get(Student student) {
        System.out.println(student.getName()+ "basariyla alindi");
    }

    @Override
    public void add(Student student) {
        System.out.println(student.getName()+ "basariyla eklendi");
    }

    @Override
    public void update(Student student) {
        System.out.println(student.getName()+ "basariyla guncellendi");
    }

    @Override
    public void delete(Student student) {
        System.out.println(student.getName()+ "basariyla silindi");
    }
}
