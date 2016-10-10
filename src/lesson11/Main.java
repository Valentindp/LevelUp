package lesson11;

import java.util.*;

public class Main {

    public static void main(String[] args) {


        List<Integer> list = new ArrayList<Integer>();

        list.add(2);
        list.add(23);
        list.add(5232);
        list.add(52332);
        list.add(43);


        ArrayList<String> listSt = new ArrayList<String>();


        for (int i = 0; i < 100; i++) {
            listSt.add("Item: " + i);
        }

//        for (String item : listSt) {
//            System.out.println(item);
//        }

        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return 0;
            }
        });

        Set<String> set = new HashSet<String>();


        new ArrayList<String>() {
            {
                add("str");
            }

            {
                add("str2");
            }
        };

        Map<String, String> map = new HashMap<>();
        map.put("KEY_ONE", "Ops");
        map.put("KEY_TWO", "Ops2");
        map.put("KEY_THREE", "Ops3");


        System.out.println(map.get("KEY_ONE"));

        Set<Integer> set2 = new HashSet<>();
        Set<Integer> set3 = new HashSet<>();
        set3.add(4);
        set3.add(43);
        set3.add(44);
        set3.add(45);
        set3.add(46);
        set2.add(4);
        set2.add(6);
        set2.add(5);

        set2.addAll(set3);

        for (int set_i:set2) {
            System.out.println(set_i);

        }



    }
}
