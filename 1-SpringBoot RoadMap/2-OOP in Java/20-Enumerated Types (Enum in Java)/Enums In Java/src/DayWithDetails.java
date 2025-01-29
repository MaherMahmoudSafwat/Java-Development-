// Enum with additional fields and methods
public enum DayWithDetails {
    MONDAY("Weekday"), TUESDAY("Weekday"), WEDNESDAY("Weekday"),
    THURSDAY("Weekday"), FRIDAY("Weekday"), SATURDAY("Weekend"), SUNDAY("Weekend");

    // Field to store the type of the day (Weekday/Weekend)
    private final String dayType;

    // Constructor to assign the type of day to each enum constant
    DayWithDetails(String dayType) {
        this.dayType = dayType;
    }

    // Method to get the day type (Weekday or Weekend)
    public String getDayType() {
        return dayType;
    }
}