package RepositoryPersistencyOnFiles.Interface;

import RepositoryPersistencyOnFiles.Tasks;

import java.util.List;

public interface TaskRepository {

    void save(Tasks task);
    Tasks findById(int id);
    List<Tasks> findAll();
    void update(Tasks task);
    void delete(int id);
}
