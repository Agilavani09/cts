package data_structure;

public class TaskLinkedList {
	 private TaskNode head;

	    public void addTask(int id, String name, String status) {
	        TaskNode newNode = new TaskNode(id, name, status);
	        if (head == null) {
	            head = newNode;
	        } else {
	            TaskNode temp = head;
	            while (temp.next != null) {
	                temp = temp.next;
	            }
	            temp.next = newNode;
	        }
	        System.out.println("Task added.");
	    }

	  
	    public void searchTask(int id) {
	        TaskNode temp = head;
	        while (temp != null) {
	            if (temp.taskId == id) {
	                System.out.print("Task found: ");
	                temp.display();
	                return;
	            }
	            temp = temp.next;
	        }
	        System.out.println("Task ID " + id + " not found.");
	    }

	    public void displayTasks() {
	        if (head == null) {
	            System.out.println("No tasks to display.");
	            return;
	        }
	        System.out.println("Task List:");
	        TaskNode temp = head;
	        while (temp != null) {
	            temp.display();
	            temp = temp.next;
	        }
	    }


	    public void deleteTask(int id) {
	        if (head == null) {
	            System.out.println("List is empty.");
	            return;
	        }
	        if (head.taskId == id) {
	            head = head.next;
	            System.out.println("Task deleted.");
	            return;
	        }
	        TaskNode current = head;
	        TaskNode prev = null;
	        while (current != null && current.taskId != id) {
	            prev = current;
	            current = current.next;
	        }
	        if (current == null) {
	            System.out.println("Task not found.");
	        } else {
	            prev.next = current.next;
	            System.out.println("Task deleted.");
	        }
	    }
}
