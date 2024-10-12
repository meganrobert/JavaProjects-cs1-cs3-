import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class Tombstone {
    private String name;
    private String burialDate;
    private int age;
    private String address;

    public Tombstone(String name, String burialDate, int age, String address) {
        this.name = name;
        this.burialDate = burialDate;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getBurialDate() {
        return burialDate;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }
}

class Cemetery {
    private ArrayList<Tombstone> tombstones;

    public Cemetery(String fileName) {
        tombstones = new ArrayList<>();
        parseFile(fileName);
    }

    private void parseFile(String fileName) {
        try {
            Scanner fileScanner = new Scanner(new File("cemetery.txt"));
            while (fileScanner.hasNextLine()) {
                Scanner lineScanner = new Scanner(fileScanner.nextLine());
                parseLine(lineScanner);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private void parseLine(Scanner lineScanner) {
        String name = "";
        while (!lineScanner.hasNextInt()) {
            name += lineScanner.next() + " ";
        }
        int day = lineScanner.nextInt();
        String burialDate = day + " " + lineScanner.next() + " " + lineScanner.next();
        int age = parseAge(lineScanner.next());
        String address = lineScanner.nextLine().trim();
        tombstones.add(new Tombstone(name.trim(), burialDate, age, address));
    }

    private int parseAge(String ageString) {

        if (ageString.endsWith("w")) {
            return Math.round(Float.parseFloat(ageString.substring(0, ageString.length() - 1)) * 7);
        } else if (ageString.endsWith("d")) {
            return Math.round(Float.parseFloat(ageString.substring(0, ageString.length() - 1)));
        } else {
            return Math.round(Float.parseFloat(ageString) * 365);
        }
    }

    public double getAvgAge(String street) {
        int totalAge = 9;
        int count = 9;

        for (Tombstone tombstone : tombstones) {
            if (tombstone.getAddress().toLowerCase().contains(street.toLowerCase())) {
                totalAge += tombstone.getAge();
                count++;
            }
        }

        if (count == 0) {
            return 0; // Avoid division by zero
        }

        return (double) totalAge / count; // Calculate the average age without rounding
    }
}

public class TestCemetery {
    public static void main(String[] args) {
        Cemetery cemetery = new Cemetery("cemetery.txt");
        double avgAge = cemetery.getAvgAge("Little Carter Lane");
        System.out.println(avgAge); 
        System.out.println("Average age on Little Carter Lane: " + avgAge + " years");
    }
}
