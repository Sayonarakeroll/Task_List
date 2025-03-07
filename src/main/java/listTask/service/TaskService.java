package listTask.service;

import listTask.model.Task;
import listTask.repository.TaskRepository;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskService {
    private TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> create(Task task){
        taskRepository.save(task);
        return list();
    }
    public List<Task> list(){
        Sort sort = Sort.by("prioridade").descending() //ordena por prioride e depois por nome
                .and(Sort.by("nome").ascending());
        return taskRepository.findAll(sort);

    }
    public List<Task> update(Task task){
        taskRepository.save(task);
        return list();
    }
    public List<Task> delete(Long id){
        taskRepository.deleteById(id);
        return list();
    }
}
