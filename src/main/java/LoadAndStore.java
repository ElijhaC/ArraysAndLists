import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoadAndStore {

    public int[] loadIntArrayFromFile(String filename) {
        ArrayList<Integer> arrList = loadIntegerArrayListFromFile("testDoubleData1.txt");
        int[] arr = new int[arrList.size()];
        for (int i = 0; i < arrList.size(); i++)
            arr[i] = arrList.get(i);
        return arr;
    }

    public ArrayList<Integer> loadIntegerArrayListFromFile(String filename) {
        // Creating an object of BufferedReader class
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(filename));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line ="";
        ArrayList<Integer> result = new ArrayList<Integer>();

        while (true) {
            try {
                if ((line = br.readLine()) == null) break; // break loop at end of file
                if (line.startsWith("//")) continue; // ignore "//" comment lines
                Integer number = Integer.parseInt(line);
                result.add(number);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    // Build these out:

    // use testDoubleData2.txt to test

    public double[] loadDoubleArrayFromFile(String filename) {
        ArrayList<Integer> arrList = loadIntegerArrayListFromFile("testDoubleData2.txt");
        double[] arr = new double[arrList.size()];
        for (int i = 0; i < arrList.size(); i++)
            arr[i] = arrList.get(i);
        return arr;
    }

    public ArrayList<Double> loadDoubleArrayListFromFile(String filename) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("testDoubleData2.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line ="";
        ArrayList<Double> result = new ArrayList<Double>();

        while (true) {
            try {
                if ((line = br.readLine()) == null) break; // break loop at end of file
                if (line.startsWith("//")) continue; // ignore "//" comment lines
                Double number = Double.parseDouble(line);
                result.add(number);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    // use testStringData3.txt to test

    public String[] loadStringArrayFromFile(String filename) {
        ArrayList<Integer> arrList = loadIntegerArrayListFromFile("testDoubleData3.txt");
        String[] arr = new String[arrList.size()];
        for (int i = 0; i < arrList.size(); i++)
            arr[i] = String.valueOf(arrList.get(i));
        return arr;
    }

    public ArrayList<String> loadStringArrayListFromFile(String filename) {
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("testDoubleData3.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String line ="";
        ArrayList<String> result = new ArrayList<String>();

        while (true) {
            try {
                if ((line = br.readLine()) == null) break; // break loop at end of file
                if (line.startsWith("//")) continue; // ignore "//" comment lines
                String number = line;
                result.add(number);
            } catch (IOException e) {
                e.printStackTrace();
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
        }

        return result;
    }

    //
    // Finally:
    //
    // Is there some way to re-factor these routines so that
    // loadStringArrayListFromFile() becomes the general case routine
    // and is the only one with IO code in it?
    // All the others become like loadIntArrayFromFile(),
    // where it calls the general case routine?
}

