// Enum example: Enum is a special class in Java used to represent a fixed set of constants or predefined values.
enum Day {
    // Enum constants are implicitly public, static, and final
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}

public class Main {
    public static void main(String[] args) {
        // Using enum values:
        Day today = Day.MONDAY;  // Assigning an enum constant to a variable

        // Switch statement with enum type
        switch (today) {
            case MONDAY:
                System.out.println("Start of the week!");
                break;
            case FRIDAY:
                System.out.println("Almost weekend!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Mid-week!");
                break;
        }

        // Enum can also be used in for-each loop
        System.out.println("\nDays of the week:");
        for (Day day : Day.values()) {
            System.out.println(day);  // prints all enum constants
        }
    }

}
