package com.github.sgoeschl.freemarker.sample.util;

import java.util.Objects;

public class Pair<K, V> {

    private final K left;
    private final V right;

    public Pair(K left, V right) {
        this.left = left;
        this.right = right;
    }

    public K getLeft() {
        return left;
    }

    public V getRight() {
        return right;
    }

    public boolean equals(Object o) {
        return o instanceof Pair && Objects.equals(left, ((Pair<?, ?>) o).left) && Objects.equals(right, ((Pair<?, ?>) o).right);
    }

    public int hashCode() {
        return 31 * Objects.hashCode(left) + Objects.hashCode(right);
    }

    public String toString() {
        return left + "=" + right;
    }
}