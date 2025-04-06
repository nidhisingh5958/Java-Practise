public class fileHandling {
    public static void main(String[] args) {
        // File handling in Java
        // Create a file
        try {
            java.io.File file = new java.io.File("example.txt");
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (java.io.IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Write to a file
        try {
            java.io.FileWriter writer = new java.io.FileWriter("example.txt");
            writer.write("Hello, World!");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (java.io.IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        // Read from a file
        try {
            java.io.FileReader reader = new java.io.FileReader("example.txt");
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
            reader.close();
        } catch (java.io.IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
