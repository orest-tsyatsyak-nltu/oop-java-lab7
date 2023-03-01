package org.orest.tsiatsiak;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Storage<F, S> {

    private final List<Pair<F, S>> stock;

    public Storage() {
        this.stock = new ArrayList<>();
    }

    public void store(F firstValue, S secondValue) {
        stock.add(new Pair<>(firstValue, secondValue));
    }

    public List<F> getFirstValuesBySecond(S secondValue) {
        return stock.stream()
                .filter(fsPair -> fsPair.second.equals(secondValue))
                .collect(LinkedList::new, (storage, fsPair) -> storage.add(fsPair.first), LinkedList::addAll);
    }

    public List<S> getSecondValuesByFirst(F firstValue) {
        return stock.stream()
                .filter(fsPair -> fsPair.first.equals(firstValue))
                .collect(LinkedList::new, (storage, fsPair) -> storage.add(fsPair.second), LinkedList::addAll);
    }

    public void deleteAllByFirstValue(F firstValue) {
        stock.removeIf(fsPair -> fsPair.first.equals(firstValue));
    }

    public void deleteAllBySecondValue(S secondValue) {
        stock.removeIf(fsPair -> fsPair.second.equals(secondValue));
    }

    public List<F> getAllFirsts() {
        return stock.stream().collect(LinkedList::new, (storage, fsPair) -> storage.add(fsPair.first), LinkedList::addAll);
    }

    public List<S> getAllSeconds() {
        return stock.stream().collect(LinkedList::new, (storage, fsPair) -> storage.add(fsPair.second), LinkedList::addAll);
    }

    @Override
    public String toString() {
        return "Storage" + stock;
    }

    private record Pair<F, S>(F first, S second) {

        @Override
        public boolean equals(Object obj) {
            if (obj == this) return true;
            if (obj == null || obj.getClass() != this.getClass()) return false;
            var that = (Pair) obj;
            return Objects.equals(this.first, that.first) &&
                    Objects.equals(this.second, that.second);
        }

        @Override
        public String toString() {
            return "Pair{" +
                    "first=" + first + ", " +
                    "second=" + second + '}';
        }

    }

}
