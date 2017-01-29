package com.hyunjae.zebu;

public interface ZipConsumer<T> {
    void accept(ZipEntry<T> t);
}
