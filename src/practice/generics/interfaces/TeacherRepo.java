package practice.generics.interfaces;

public class TeacherRepo implements Repository<Teacher>{
    @Override
    public void get(Teacher teacher) {
        System.out.println(teacher.getName()+"basariyla alindi");
    }

    @Override
    public void add(Teacher teacher) {
        System.out.println(teacher.getName()+"basariyla eklendi");
    }

    @Override
    public void update(Teacher teacher) {
        System.out.println(teacher.getName()+"basariyla guncellendi");
    }

    @Override
    public void delete(Teacher teacher) {
        System.out.println(teacher.getName()+"basariyla silindi");
    }
}
