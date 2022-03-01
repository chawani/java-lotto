package lotto.domain;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class LottoResult {
    private static final int DEFAULT_COUNT = 0;

    private final Map<Rank, Integer> lottoResult = new HashMap<>();

    public LottoResult() {
        for (Rank rank : Rank.values()) {
            lottoResult.put(rank, DEFAULT_COUNT);
        }
    }

    public Map<Rank, Integer> getLottoResult() {
        return Collections.unmodifiableMap(lottoResult);
    }

    public void addMatchingCount(Lottos lottos, WinningLotto winningLotto) {
        for (Lotto lotto : lottos.getLottos()) {
            Rank rank = lotto.getRank(winningLotto);
            lottoResult.put(rank, lottoResult.get(rank) + 1);
        }
    }

    public Profit getProfit() {
        Money totalMoney = new Money(0);

        for (Rank rank : Rank.values()) {
            Money prizeMoney = rank.getPrizeMoney();
            prizeMoney.multiply(lottoResult.get(rank));
            totalMoney.add(prizeMoney.getMoney());
        }

        return new Profit(totalMoney);
    }
}
