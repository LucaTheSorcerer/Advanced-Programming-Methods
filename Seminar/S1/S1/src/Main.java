public class Main {

    public static String reverse(String input) {
        StringBuilder result = new StringBuilder();
        for(int i = input.length(); i > 0; i--) {
            result.append(input.charAt(i - 1));
        }

        return result.toString();
    }
        public static void main(String[] args) {
            Ex1 ex1 = new Ex1();
            System.out.println(ex1.add(1, 2));
            System.out.println(ex1.sub(1, 2));
            System.out.println(ex1.multiply(1, 2));

            System.out.println(reverse("pln"));

            System.out.print(new Student("Bob", 20).toString());

            System.out.print("\n");

            Sentence sentence = new Sentence();
            System.out.println(sentence.countWords("Hello World"));

            PerfectNumber number = new PerfectNumber();
            System.out.println(number.isPerfect(6));

            WeatherStation station = new WeatherStation(new int[]{12, 14, 9, 12, 15, 16, 15, 15, 11, 8, 13, 13, 15, 12});

            System.out.println(station.computeAverageTemp());

            station.findMinMaxTemp();

            station.findBiggestTempChange();

            station.printTable();

            System.out.println("\n");

            String table = station.toString();

            System.out.println(table);
        }
}
