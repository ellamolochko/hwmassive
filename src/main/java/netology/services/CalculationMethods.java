package netology.services;

public class CalculationMethods {
    public int amountofsales(long[] months) {
        int amount = 0;

        for (int i = 0; i < months.length; i++) {
            amount += months[i];
        }

        return amount;
    }


    public int midsales(long[] months) {
        int amount = 0;

        for (int i = 0; i < months.length; i++) {
            amount += months[i];
        }

        return amount / months.length;
    }


    public int peakofsales(long[] months) {
        int peak = (int) months[0];
        int maxMonth = 0;

        for (int i = 0; i < months.length; i++) {
            if (peak <= months[i]) {
                peak = (int) months[i];
                maxMonth = i + 1;
            }
        }
        return maxMonth;
    }


    public int minofsales(long[] months) {
        int min = (int) months[0];
        int minMonth = 0;

        for (int i = 0; i < months.length; i++) {
            if (min >= months[i]) {
                min = (int) months[i];
                minMonth = i + 1;
            }
        }
        return minMonth;
    }


    public int UnderMidOfMonths(long[] months) {
        int amount = 0;
        int AmountOfMonths = 0;

        for (int i = 0; i < months.length; i++) {
            amount += months[i];
        }
        for (int i = 0; i < months.length; i++) {
            if (months[i] < amount / months.length) {
                AmountOfMonths++;
            }
        }
        return AmountOfMonths;
    }


    public int UpMidOfMonths(long[] months) {
        int amount = 0;
        int AmountOfMonths = 0;

        for (int i = 0; i < months.length; i++) {
            amount += months[i];
        }
        for (int i = 0; i < months.length; i++) {
            if (months[i] > amount / months.length) {
                AmountOfMonths++;
            }
        }
        return AmountOfMonths;
    }

}









