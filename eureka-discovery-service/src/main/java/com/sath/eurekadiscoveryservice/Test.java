package com.sath.eurekadiscoveryservice;

import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class Test {
    public static  void main(String s[]){
        Path path1 = Path.of("/a/b");
        Path path2 = Path.of("/a/c");
        System.out.println(path1.resolve(path2));

        Stream<String> stream = Stream.of("A","B");
        String[] output = stream.toArray(String[] :: new);
        System.out.println(Arrays.toString(output));


    }
}
