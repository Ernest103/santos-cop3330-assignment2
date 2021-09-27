package ex35;

import java.util.ArrayList;

public class List {
    private static ArrayList<String> nameList;

    public List() {
        nameList = new ArrayList<>();
    }

    public void initNames(String name)
    {
        nameList.add(name);
    }

    public String winner(){
        if(nameList == null) //List is empty
            return null;

        int w = (int)(Math.random() * nameList.size());

        return nameList.get(w);
    }

    public void displayList(){
        for (String s : nameList) System.out.println(s);
    }
}
