public class Weekdaysprinte {
    public static void main(String[] args) throws Exception {
        String[] Daysoftheweek = { "sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday" };

        for (int i = 0; i < Daysoftheweek.length; i++) {
            if (i >= 5)
                break;
            System.out.println(Daysoftheweek[i]);

        }

    }
}
