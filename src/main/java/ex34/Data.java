package ex34;


import java.util.Locale;

public class Data {
    private static String[] names = new String[5];
    private static int nameCount = 5;

    public Data() {
        initNames();
    }

    private static void initNames()
    {
        names = new String[]{
                "John Smith",
                "Jackie Jackson",
                "Chris Jones",
                "Amanda Cullen",
                "Jeremy Goodwin"
        };
    }

    public int delName(String name){
        for (int i = 0; i < nameCount; i++)
        {
            if(names[i].toLowerCase(Locale.ROOT).equals(name)){
                for(int j = i; j < nameCount - 1; j++)
                {
                    names[j] = names[j + 1];
                }
                nameCount--;
                return 1;
            }
        }
        return 0;
    }

    public void displayList()
    {
        System.out.println("There are " + nameCount + " employees.");

        for(int i = 0; i < nameCount; i++)
        {
            System.out.println(names[i]);
        }
    }
}
