package ex36;

import java.util.ArrayList;

public class Data {
    private static ArrayList<String> resTimes;
    private static double avg, _min, _max, stdd;

    public Data() {
        resTimes = new ArrayList<>();
        avg = 0;
        _min = 0;
        _max = 0;
        stdd = 0;
    }

    public static double getAvg() {
        return avg;
    }

    public static double get_min() {
        return _min;
    }

    public static double get_max() {
        return _max;
    }

    public static double getStdd() {
        return stdd;
    }

    public void initData(String input) {
        resTimes.add(input);
    }

    public void prepData(){
        average();
        min();
        max();
        set_std();
    }

    private void average(){

        for (String resTime : resTimes) {
            avg += Double.parseDouble(resTime);
        }

        avg /= resTimes.size();
    }

    private void min(){
        _min = Double.parseDouble(resTimes.get(0));

        for (String resTime : resTimes)
        {
            if(_min > Double.parseDouble(resTime))
                _min = Double.parseDouble(resTime);
        }

    }

    private void max(){
        _max = Double.parseDouble(resTimes.get(0));

        for (String resTime : resTimes)
        {
            if(_max < Double.parseDouble(resTime))
                _max = Double.parseDouble(resTime);
        }

    }

    private void set_std(){
        double temp;

        for (String resTime : resTimes) {
            temp = Double.parseDouble(resTime);

            stdd += Math.pow((temp - avg), 2);
        }

        stdd /= resTimes.size();

        stdd = Math.sqrt(stdd);
    }


    public void displayData(){

        System.out.print("Numbers: ");
        for (String resTime : resTimes)
        {
            System.out.print(resTime + " ");
        }
        System.out.printf("\nThe average is %.1f\n" +
                "The minimum is %.0f\n" +
                "The maximum is %.0f\n" +
                "The standard deviation is %.2f", avg, _min, _max, stdd);
    }
}
