package com.hyunjae.zebu;

import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class ZipIterator<T> {

    private final List<Iterator<T>> iterators;

    public ZipIterator(List<Iterator<T>> iterators) {
        this.iterators = iterators;
    }

    public boolean hasNext() {
        return iterators.stream()
                .allMatch(Iterator::hasNext);
    }

    public ZipEntry<T> next() {
        return new ZipEntry<>(
                iterators.stream()
                        .map(Iterator::next)
                        .collect(Collectors.toList())
        );
    }
}
