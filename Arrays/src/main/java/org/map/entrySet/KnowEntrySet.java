package org.map.entrySet;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class KnowEntrySet {


    /* The java.util.Map.entrySet() method on java is used to create a set out of the same elements
    contained in the map. It basically returns a set view of the map or we can create a new set and
    store the map elements into them.

    map.entrySet()

    It does not take any parameter
    The method returns a set having same elements as the hash map.s
    * */

    public static void main (String[] args){
        Map<Integer, String> inputMap = new HashMap<Integer, String>();
        Map<Integer, String> inputMap2 = new HashMap<Integer, String>();

        inputMap.put(10, "Geeks");
        inputMap.put(11, "Geeks1");
        inputMap.put(12, "Geeks2");
        inputMap.put(13, "Geeks3");
        inputMap.put(14, "Geeks4");
        inputMap.put(14, "Geeks5");
        inputMap.put(14, "Geeks5");
        inputMap.put(14, "Geeks6");

       Set<Map.Entry<Integer, String>> testSet= new HashSet<>();
        testSet =    inputMap.entrySet();

System.out.println("Original map is::" + inputMap);

        System.out.println("Set from the original map is::" + inputMap.entrySet());


        System.out.println("Original map is::" + inputMap);

        System.out.println("Original map is::" + testSet);
        System.out.println("Original map is::" + testSet);
        System.out.println("Original map is::" + testSet);



    }
}
