package com.kodilla.hibernate.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskDaoTestSuite {
    private static final String DESCRIPTION = "Test: Learn Hibernate";
    private static final String LISTNAME = "TaskList: Write Entities 1:N";
    @Autowired
    private TaskDao taskDao;
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testTaskDaoSave() {
        //Given
        Task task = new Task(DESCRIPTION, 7);

        //When
        taskDao.save(task);

        //Then
        int id = task.getId();
        Optional<Task> readTask = taskDao.findById(id);
        Assert.assertTrue(readTask.isPresent());

        //CleanUp
        taskDao.deleteById(id);
    }

//    @Test
//    public void testToDeleteById() {
//
////        taskDao.deleteById(23);
////        taskDao.deleteById(26);
////        taskDao.deleteById(28);
//
////        taskListDao.deleteById(25);
//
////        Assert.assertEquals(1, 1);
//    }

    @Test
    public void testTaskDaoFindByDuration() {
        //Given
        Task task = new Task(DESCRIPTION, 7);
        taskDao.save(task);
        int duration = task.getDuration();

        //When
        List<Task> readTasks = taskDao.findByDuration(duration);

        //Then
        Assert.assertEquals(1, readTasks.size());

//        CleanUp
        int id = readTasks.get(0).getId();
        taskDao.deleteById(id);
    }
    @Test
    public void testTaskDaoSaveWithFinancialDetails() {
        //Given
        Task task = new Task(DESCRIPTION, 30);
        task.setTaskFinancialDetails(new TaskFinancialDetails(new BigDecimal(120), false));

        //When
        taskDao.save(task);
        int id = task.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        taskDao.deleteById(id);
    }

    @Test
    public void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        Assert.assertNotEquals(0, id);

        // CleanUp
        taskListDao.deleteById(id);
    }

}