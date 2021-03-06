package com.hyunjae.zebu;

import java.util.List;

public class ZipEntry<T> {

    private final List<T> entry;

    public ZipEntry(List<T> entry) {
        this.entry = entry;
    }

    public T get(int index) {
        return entry.get(index);
    }

    public T set(int index, T element) {
        return entry.set(index, element);
    }

    @Override
    public String toString() {
        return entry.toString();
    }
}
