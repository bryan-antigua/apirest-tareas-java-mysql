package com.bryan.apirest.apirest.Controller;

import com.bryan.apirest.apirest.Repositories.TaskRepository;
import com.bryan.apirest.apirest.models.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;;

    @GetMapping(value = "/tareas")
    public List<Task> gettarea(){
        return taskRepository.findAll();
    }

    @PostMapping(value = "/api/tasks")
    public String createTask(@RequestBody Task task) {
        taskRepository.save(task);
        return "tarea guaradada";
    }
    @PutMapping("/update/{id}")
    public Task actualizarTarea(@PathVariable Long id, @RequestBody Task tareaActualizada) {
        return taskRepository.findById(id).map(tarea -> {
            tarea.setDescription(tareaActualizada.getDescription());
            tarea.setEstado(tareaActualizada.getEstado());
            return taskRepository.save(tarea);
        }).orElseThrow(() -> new RuntimeException("Tarea no encontrada con id: " + id));
    }
    // Eliminar una tarea por su ID (DELETE http://localhost:8080/tareas/{id})
    @DeleteMapping("/delete/{id}")
    public String eliminarTarea(@PathVariable Long id) {
        return taskRepository.findById(id).map(tarea -> {
            taskRepository.delete(tarea);
            return "Tarea con ID " + id + " eliminada correctamente.";
        }).orElseThrow(() -> new RuntimeException("Tarea no encontrada con ID: " + id));
    }

}
