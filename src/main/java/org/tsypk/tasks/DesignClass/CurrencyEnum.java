package org.tsypk.tasks.DesignClass;

import java.util.Arrays;
import java.util.Optional;
import java.util.Set;

public class CurrencyEnum<T> {
    public static final CurrencyEnum RUB = new CurrencyEnum("RUB");
    public static final CurrencyEnum USD = new CurrencyEnum("USD");
    public static final CurrencyEnum EUR = new CurrencyEnum("EUR");
    private static Set<CurrencyEnum> valueSet = Set.of(
        Arrays.stream(CurrencyEnum.class.getDeclaredFields())
            .map(it -> {
                try {
                    return (CurrencyEnum) it.get(CurrencyEnum.class);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
            })
            .toArray(CurrencyEnum[]::new)
    );
    private static int currentOrdinal = 0;
    public int ordinal;
    public String value;

    private CurrencyEnum(String value) {
        this.value = value;
        this.ordinal = currentOrdinal++;
    }

    public Set<CurrencyEnum> getAllValues() {
        return valueSet;
    }

    public Optional<CurrencyEnum> getByOrdinal(int ordinal) {
        return valueSet.stream()
            .filter(it -> it.ordinal == ordinal)
            .findFirst();
    }

    public Optional<CurrencyEnum> getByValue(String value) {
        return valueSet.stream()
            .filter(it -> it.value.equals(value))
            .findFirst();
    }
}
