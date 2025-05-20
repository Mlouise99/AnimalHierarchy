package implementation;

import java.util.List;

public interface StudentManagerInterface<T,K>{

void addStudent(T entity) throws Exception;
T getById(K id) throws Exception;
List<T> getAll() throws Exception;
void update(T entity) throws Exception;
void delete(Integer id, int cid) throws Exception;

    void delete(Integer id) throws Exception;
}
