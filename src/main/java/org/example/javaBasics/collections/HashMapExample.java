package org.example.javaBasics.collections;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    Map<String,Integer> integerMap  = new HashMap<>();//creating an empty map
    Map<String,Integer> singleton = Collections.singletonMap("test",-1);
    Map<String,Integer> empty = Collections.<String,Integer> emptyMap();

    String[] words  = { "Tshepo","is","good"};

    //TODO
  //  for(int i =0; i < words.length; i ++){

   //     integerMap.put(words[i].toUpperCase(),i );

  //  }

}
