package com.xworkz.busy.projects;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class VirtualShell {
    private static File currentDir = new File(System.getProperty("user.dir"));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(currentDir.getAbsolutePath() + " $ ");
            String input = scanner.nextLine().trim();

            if (input.isEmpty()) continue;

            boolean isBackground = input.endsWith("&");
            if (isBackground) {
                input = input.substring(0, input.length() - 1).trim();
            }

            final String command = input;

            Runnable task = () -> executeCommand(command);

            if (isBackground) {
                new Thread(task).start();
            } else {
                task.run();
            }
        }
    }

    private static void executeCommand(String input) {
        String[] parts = input.split("\\s+");
        String cmd = parts[0];
        String[] args = new String[parts.length - 1];
        System.arraycopy(parts, 1, args, 0, args.length);

        switch (cmd) {
            case "cd":
                changeDirectory(args);
                break;
            case "ls":
                listDirectory();
                break;
            case "mkdir":
                makeDirectory(args);
                break;
            case "rm":
                removeFile(args);
                break;
            case "touch":
                createFile(args);
                break;
            case "exit":
                System.exit(0);
                break;
            default:
                System.out.println("Unknown command: " + cmd);
        }
    }

    private static void changeDirectory(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: cd <directory>");
            return;
        }
        File newDir = new File(currentDir, args[0]);
        if (newDir.exists() && newDir.isDirectory()) {
            currentDir = newDir;
        } else {
            System.out.println("Directory not found.");
        }
    }

    private static void listDirectory() {
        File[] files = currentDir.listFiles();
        if (files != null) {
            for (File file : files) {
                System.out.println((file.isDirectory() ? "[DIR] " : "      ") + file.getName());
            }
        }
    }

    private static void makeDirectory(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: mkdir <foldername>");
            return;
        }
        File dir = new File(currentDir, args[0]);
        if (!dir.mkdir()) {
            System.out.println("Failed to create directory.");
        }
    }

    private static void removeFile(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: rm <filename>");
            return;
        }
        File file = new File(currentDir, args[0]);
        if (!file.exists()) {
            System.out.println("File not found.");
        } else if (!file.delete()) {
            System.out.println("Failed to delete file.");
        }
    }

    private static void createFile(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: touch <filename>");
            return;
        }
        File file = new File(currentDir, args[0]);
        try {
            if (!file.createNewFile()) {
                System.out.println("File already exists or error occurred.");
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}