package RepositoryPersistencyOnFiles.Service;

import RepositoryPersistencyOnFiles.Interface.TaskRepository;
import RepositoryPersistencyOnFiles.Tasks;

import java.util.List;

public class TaskService {

    private final TaskRepository repository;

    public TaskService(TaskRepository repository) {
        this.repository = repository;
    }

    public void createTask(int id, String description){
        Tasks task = new Tasks(id, description, false);
        repository.save(task);
    }

    public Tasks findTask(int id) {
        return repository.findById(id);
    }


    public List<Tasks> loadTasks() {
        return repository.findAll();
    }

    public void concludedTask(int id) {
        Tasks task = repository.findById(id);
        if (task != null) {
            task.setConcluded(true);
            repository.update(task);
        }
    }


    public void deleteTask(int id) {
        repository.delete(id);
    }


}
