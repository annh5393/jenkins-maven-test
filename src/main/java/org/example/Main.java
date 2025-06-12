package org.example;

public class Main {

    // Thêm constructor private để ngăn tạo đối tượng từ lớp này
    private Main() {
        // Utility class should not be instantiated
    }

    /**
     * Entry point of the application.
     *
     * @param args the command-line arguments
     */
    public static void main(final String[] args) {
        System.out.println("Hello, world!");
    }
}
