package onsite.academy.myworkday.repository;

import onsite.academy.myworkday.model.Effort;
import onsite.academy.myworkday.model.Task;
import onsite.academy.myworkday.repository.TaskRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class TaskRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private TaskRepository taskRepository;

    private Task task1;

    @BeforeEach
    public void setUp() {
        task1 = new Task();
        task1.setEffort(Effort.FOUR_HOURS);
        task1.setIsCompleted(false);
        entityManager.persist(task1);

        Task task2 = new Task();
        task2.setEffort(Effort.TWO_HOURS);
        task2.setIsCompleted(true);
        entityManager.persist(task2);

        entityManager.flush();
    }


}