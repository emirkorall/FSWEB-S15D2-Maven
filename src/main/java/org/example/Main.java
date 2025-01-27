package org.example;

import org.example.entity.Priority;
import org.example.entity.Status;
import org.example.entity.Task;
import org.example.entity.TaskData;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Task> annsTasks = new HashSet<>();
        Task taskAnn = new Task("project1", "project1 desc", "ann", Status.ASSIGNED, Priority.HIGH);
        Task taskAnn2 = new Task("project1", "project1 desc 2", "ann", Status.ASSIGNED, Priority.HIGH);

        annsTasks.add(taskAnn);
        annsTasks.add(taskAnn2);

        Set<Task> bobsTasks = new HashSet<>();
        Task taskBob = new Task("project1", "project1 desc", "bob", Status.IN_QUEUE, Priority.MED);
        Task taskBob2 = new Task("project1", "project1 desc 2", "bob", Status.IN_QUEUE, Priority.MED);

        bobsTasks.add(taskBob);
        bobsTasks.add(taskBob2);

        Set<Task> carolsTasks = new HashSet<>();
        Task taskCarol = new Task("project1", "project1 desc", "carol", Status.IN_PROGRESS, Priority.LOW);
        Task taskCarol2 = new Task("project1", "project1 desc 2", "carol", Status.IN_PROGRESS, Priority.LOW);

        carolsTasks.add(taskCarol);
        carolsTasks.add(taskCarol2);

        Set<Task> unassignedTasks = new HashSet<>();
        Task taskUnassigned = new Task("project1", "project1 desc", "null", Status.IN_PROGRESS, Priority.LOW);
        unassignedTasks.add(taskUnassigned);


        TaskData taskData = new TaskData(annsTasks, bobsTasks, carolsTasks, unassignedTasks);
        System.out.println(taskData.getTasks("bob"));
        System.out.println(taskData.getTasks("ann"));
        System.out.println(taskData.getTasks("carol"));
    }
}
