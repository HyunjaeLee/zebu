package com.hyunjae.zebu;

import java.util.List;
import java.util.stream.Collectors;

public class ZipIterable<T> {

    private final List<Iterable<T>> iterables;

    public ZipIterable(List<Iterable<T>> iterables) {
        this.iterables = iterables;
    }

    public ZipIterator<T> iterator() {
        return new ZipIterator<>(
                iterables.stream()
                        .map(Iterable::iterator)
                        .collect(Collectors.toList())
        );
    }

    public void forEach(ZipConsumer<T> action) {
        ZipIterator<T> iterator = iterator();
        while(iterator.hasNext()) {
            action.accept(iterator.next());
        }
    }
}
