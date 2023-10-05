public class WeatherStation {

    //day: 1 2 3 4 5 6 7 8 9 10 11 12 13 14
    //temp: 10 12 14 16 18 20 22 24 26 28 30 32 34 36

    private int[] temperatures;

    public WeatherStation(int[] temperatures) {
        this.temperatures = temperatures;
    }

    public double computeAverageTemp() {
        double sum = 0;
        for(int temp : temperatures)
            sum += temp;

        return sum / temperatures.length;
    }


    public Pair<Integer, Integer> findMinMaxTemp() {
        int min = temperatures[0];
        int max = temperatures[0];

        for(int temp : temperatures) {
            if(temp < min)
                min = temp;
            if(temp > max)
                max = temp;

        }

        System.out.println("Min: " + min + " Max: " + max);

        return new Pair<>(min, max);

    }


    public Pair<Integer, Integer> findBiggestTempChange() {
        int max = 0, day1 = 1, day2 = 2;
        for(int i = 0; i < temperatures.length - 1; i++) {
            if(Math.abs(temperatures[i] - temperatures[i + 1]) > max) {
                max = Math.abs(temperatures[i] - temperatures[i + 1]);
                day1 = i + 1;
                day2 = i + 2;
            }
        }

        System.out.println("Day1: " + day1 + " Day2: " + day2);

        return new Pair<>(day1, day2);
    }


    public void printTable() {
        System.out.println("Day\tTemp");
        for(int i = 0; i < temperatures.length; i++) {
            System.out.println((i + 1) + "\t" + temperatures[i]);
        }
    }

    @Override
    public String toString() {

        StringBuilder table = new StringBuilder();

        table.append("Day\tTemp\n");

        for(int i = 0; i < temperatures.length; i++) {
            table.append((i + 1) + "\t" + temperatures[i] + "\n");
        }

        return table.toString();

    }
}

class Pair<T, U> {
    public final T t;
    public final U u;

    public Pair(T t, U u) {
        this.t= t;
        this.u= u;
    }
}
