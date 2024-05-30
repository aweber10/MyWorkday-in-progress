package onsite.academy.myworkday.service;

import onsite.academy.myworkday.model.Effort;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import onsite.academy.myworkday.model.Task;
import onsite.academy.myworkday.repository.TaskRepository;

import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.Mockito.when;

public class TaskServiceTest {

    @Mock
    TaskRepository taskRepository = Mockito.mock(TaskRepository.class);

    @InjectMocks
    private TaskService taskService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    // fachliche Tests kommen hier hinein


}
