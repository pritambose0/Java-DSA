import java.util.Scanner;

public class FCFSAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of processes: ");
        int numProcesses = scanner.nextInt();

        int[][] processes = new int[numProcesses][4];

        System.out.println("Enter the burst time for each process:");
        for (int i = 0; i < numProcesses; i++) {
            System.out.print("Process " + (i + 1) + " burst time: ");
            processes[i][1] = scanner.nextInt();
            processes[i][0] = i + 1; // Assign a unique process ID to each process
        }

        processes[0][2] = 0; // The waiting time for the first process is 0

        for (int i = 1; i < numProcesses; i++) {
            processes[i][2] = processes[i - 1][2] + processes[i - 1][1]; // Calculate waiting time
        }

        int totalWaitingTime = 0;
        int totalTurnaroundTime = 0;

        for (int i = 0; i < numProcesses; i++) {
            processes[i][3] = processes[i][2] + processes[i][1]; // Calculate turnaround time
            totalWaitingTime += processes[i][2];
            totalTurnaroundTime += processes[i][3];
        }

        double averageWaitingTime = (double) totalWaitingTime / numProcesses;
        double averageTurnaroundTime = (double) totalTurnaroundTime / numProcesses;

        System.out.println("\nProcess\t\tBurst Time\tWaiting Time\tTurnaround Time");
        for (int i = 0; i < numProcesses; i++) {
            System.out.println(processes[i][0] + "\t\t" + processes[i][1] + "\t\t" + processes[i][2] + "\t\t" + processes[i][3]);
        }

        System.out.println("\nAverage Waiting Time: " + averageWaitingTime);
        System.out.println("Average Turnaround Time: " + averageTurnaroundTime);
        scanner.close();
    }
}
