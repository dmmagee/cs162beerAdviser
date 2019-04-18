package edu.osucascades.beeradviser;

public class MageeDMarathon {
    public static void main(String[] args) {
        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };
        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };

        System.out.println("Name:       Time: (mins)\n"
                + "-------------------------");
        for (int i = 0; i < names.length; ++i) {
            System.out.println(names[i] + ":    " + times[i]);
        }
        int bestTime = Integer.MAX_VALUE;
        int secondBest = Integer.MIN_VALUE;
        int secondBestCheck = Integer.MAX_VALUE;
        int firstBestPerson = 0;
        int secondBestPerson = 0;

        // This code works for the fastest, but not the second fastest yet.
        for (int i = 0; i < times.length; i++) {
            if (times[i] < bestTime) {
                secondBestCheck = times[i];
                if (secondBest > secondBestCheck) {
                    secondBest = bestTime;
                } else {
                    secondBest = secondBestCheck;
                }
                bestTime = times[i];
                firstBestPerson = i;
                secondBestPerson = i;
            }
        }

        System.out.println("\nThe fastest runner in the Boston Marathon was:\n"
                + names[firstBestPerson] + "\n"
                + "With the run time of:\n"
                + bestTime + " minutes\n"
                + "With the runner up:\n"
                + names[secondBestPerson] + "\n"
                + "With a run time of:\n"
                + secondBest + " minutes");
    }
}
