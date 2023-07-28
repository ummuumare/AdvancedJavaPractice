package practice.generics.interfaces;

public interface Repository <T>{
     void get(T t);
     void add(T t);
     void  update (T t);
     void delete (T t);
}
