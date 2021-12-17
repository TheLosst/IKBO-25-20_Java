package pr8;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.lang.Math;

public class Practice8
{

    public static void main(String[] args)
    {
        Pet_2 obj = new Pet_2(0);
        obj.entry();
        obj.call();
        System.out.print(obj.repeats());
    }
}

class Pet_2
{
    public int index;
    public int num;

    Map<String, Pet_2> hashmap = new HashMap<String, Pet_2>();
    ArrayList<String> people = new ArrayList<String>();
    ArrayList<Integer> digits = new ArrayList<>();

    Pet_2(int index) {
        this.index = index;
    }
    int get(){ return index; }

    void entry()
    {
        people.add("ObjectMan1");
        people.add("ObjectMan2");
        people.add("ObjectMan3");
        people.add("ObjectMan4");
        people.add("ObjectMan5");

        int max = 10;
        int min = 1;

        for(int i = 0; i < people.size(); i++)
        {
            num = (int) (Math.random() * ((max - min) + 1)) + min;
            digits.add(num);
            hashmap.put(people.get(i), new Pet_2(num));
        }
    }


    public void call()
    {
        for(Map.Entry<String, Pet_2> item : hashmap.entrySet()){
            System.out.printf("KEY: %s  INDEX: %s \n", item.getKey(), item.getValue().get());
        }
    }

    public int repeats()
    {
        int k = 0;
        for(int i = 0; i<digits.size();i++)
            for (int j = 0; j < digits.size(); j++)
                if (i != j)
                    if (digits.get(i) == digits.get(j))
                        k++;

        return k;

    }
}