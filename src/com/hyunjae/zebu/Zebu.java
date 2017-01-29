package com.hyunjae.zebu;

import java.util.Arrays;

public class Zebu {

    private Zebu() {
    }

    @SafeVarargs
    public static <T> ZipIterable<T> zip(Iterable<T>... iterables) {
        return new ZipIterable<>(Arrays.asList(iterables));
    }
}
