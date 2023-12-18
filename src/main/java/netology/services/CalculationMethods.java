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
        int midAmount = amountofsales(months) / months.length;
        return midAmount;
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
        int amountOfMonths = 0;
        int midAmount = midsales(months);
        for (int i = 0; i < months.length; i++) {
            if (months[i] < midAmount) {
                amountOfMonths++;
            }
        }
        return amountOfMonths;
    }


    public int UpMidOfMonths(long[] months) {
        int midAmount = midsales(months);
        int amountOfMonths = 0;
        for (int i = 0; i < months.length; i++) {
            if (months[i] > midAmount) {
                amountOfMonths++;
            }
        }
        return amountOfMonths;
    }

}









