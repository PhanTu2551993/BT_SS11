package Bt6;

import java.util.ArrayList;
import java.util.List;

public class Bt6 {
    public static void main(String[] args) {
        List<Integer> listInteger = new ArrayList<Integer>();

        listInteger.add(1);
        listInteger.add(9);
        listInteger.add(3);
        listInteger.add(20);
        listInteger.add(5);
        listInteger.add(6);
        listInteger.add(8);

        for (int i = 0; i < listInteger.size(); i++)
        {
            for (int j = 0; j < listInteger.size() -i - 1 ; j++)
            {
                if (listInteger.get(j) > listInteger.get(j+1))
                {
                    int temp = listInteger.get(j);
                    listInteger.set(j,listInteger.get(j+1));
                    listInteger.set(j+1,temp);
                }
            }
        }
        for (int i = 0; i < listInteger.size(); i++)
        {
            System.out.println(listInteger.get(i));

        }

    }
}
