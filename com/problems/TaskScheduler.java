package com.problems;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class TaskScheduler {

    static class Task {
        int deadline;
        int timeRequired;

        Task(int deadline, int timeRequired) {
            this.deadline = deadline;
            this.timeRequired = timeRequired;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int T = sc.nextInt();
        List<Task> tasks = new ArrayList<>();
        
        for (int i = 0; i < T; i++) {
            int deadline = sc.nextInt();
            int timeRequired = sc.nextInt();
            tasks.add(new Task(deadline, timeRequired));
        }
        
        Collections.sort(tasks, Comparator.comparingInt(t -> t.deadline));
        
        int currentTime = 0;
        int maxDelay = 0;

        for (Task task : tasks) {
            currentTime += task.timeRequired;
            int delay = currentTime - task.deadline;
            if (delay > maxDelay) {
                maxDelay = delay;
            }
        }
        
        System.out.println(maxDelay);
        
        sc.close();
    }
}
