package data_structure;

public class TaskNode {
	int taskId;
    String taskName;
    String status;
    TaskNode next;

    public TaskNode(int taskId, String taskName, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.status = status;
        this.next = null;
    }

    public void display() {
        System.out.println("Task ID: " + taskId + ", Name: " + taskName + ", Status: " + status);
    }
}
