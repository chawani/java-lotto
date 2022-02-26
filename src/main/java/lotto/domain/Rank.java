package lotto.domain;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public enum Rank {
    FIRST(new Money(2_000_000_000), 6, false),
    SECOND(new Money(30_000_000), 5, true),
    THIRD(new Money(1_500_000), 5, false),
    FOURTH(new Money(50_000), 4, false),
    FIFTH(new Money(5_000), 3, false),
    NOTHING(new Money(0), 0, false);

    private final Money money;
    private final int count;
    private final boolean isBonus;

    Rank(Money money, int count, boolean isBonus) {
        this.money = money;
        this.count = count;
        this.isBonus = isBonus;
    }

    public static Rank getInstance(int matchingCount, boolean isBonus) {
        return Arrays.stream(values())
            .filter(rank -> rank.count == matchingCount && rank.isBonus == isBonus)
            .findFirst()
            .orElse(NOTHING);
    }

    public Money getMoney() {
        return this.money;
    }

    public int getCount() {
        return this.count;
    }

    public boolean isBonus() {
        return this.isBonus;
    }

    public static List<Rank> getSortedRanks() {
        return Arrays.stream(values())
            .sorted(Comparator.comparing(Rank::getMoney))
            .filter(rank -> rank != NOTHING)
            .collect(Collectors.toList());
    }
}
