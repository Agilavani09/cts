package data_structure;

public class AppTaskManager {
	public static void main(String[] args) {
        TaskLinkedList taskList = new TaskLinkedList();

        taskList.addTask(101, "Design Homepage", "Pending");
        taskList.addTask(102, "Fix Login Bug", "In Progress");
        taskList.addTask(103, "Write Tests", "Completed");

        taskList.displayTasks();

        taskList.searchTask(102);
        taskList.deleteTask(101);

        taskList.displayTasks();
    }
}
