package RepositoryPersistencyOnFiles.Repository;

import RepositoryPersistencyOnFiles.Interface.TaskRepository;
import RepositoryPersistencyOnFiles.Tasks;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class TaskRepositoryOnFile implements TaskRepository {

    private final File file;

    public TaskRepositoryOnFile(String filePath) {
        this.file = new File(filePath);
    }

    private List<Tasks> loadTasks() {
        List<Tasks> tasks = new ArrayList<>();

        if (!file.exists()) {
            return tasks;
        }

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String row;
            while ((row = br.readLine()) != null) {
                tasks.add(Tasks.fromString(row));
            }
        } catch (IOException e) {
            throw new RuntimeException("Error while trying to read file", e);
        }
        return tasks;
    }

    private void saveAll(List<Tasks> tasks) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Tasks t : tasks) {
                bw.write(t.toString());
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException("Error while trying to save file", e);
        }
    }
    
    @Override
    public void save(Tasks task) {
        List<Tasks> tasks = loadTasks();
        tasks.add(task);
        saveAll(tasks);
    }

    @Override
    public Tasks findById(int id) {
        return loadTasks()
                .stream()
                .filter(t -> t.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Tasks> findAll() {
        return loadTasks();
    }

    @Override
    public void update(Tasks taskUpdated) {
        List<Tasks> tasks = loadTasks();
        for (int i = 0; i < tasks.size(); i++) {
            if (tasks.get(i).getId() == taskUpdated.getId()) {
                tasks.set(i, taskUpdated);
                break;
            }
        }
        saveAll(tasks);
    }

    @Override
    public void delete(int id) {
        List<Tasks> tasks = loadTasks();
        tasks.removeIf(t -> t.getId() == id);
        saveAll(tasks);
    }

}
