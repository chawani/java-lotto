package lotto.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class LottoTicketFactory {
    private static final int MIN_LOTTO_NUMBER = 1;
    private static final int MAX_LOTTO_NUMBER = 45;
    private static final int LOTTO_PRICE = 1000;
    private static final int START_INDEX = 0;
    private static final int LOTTO_TICKET_SIZE = 6;

    private final List<LottoNumber> lottoNumberRange;

    public LottoTicketFactory() {
        this.lottoNumberRange = new ArrayList<>();
        IntStream.range(MIN_LOTTO_NUMBER, MAX_LOTTO_NUMBER)
                .forEach(number -> lottoNumberRange.add(new LottoNumber(Integer.toString(number))));
    }

    public List<LottoTicket> buyLottoTickets(Money money) {
        List<LottoTicket> lottoTickets = new ArrayList<>();

        int length = (int) money.getValue() / LOTTO_PRICE;
        for (int i = 0; i < length; i++) {
            lottoTickets.add(new LottoTicket(createLottoTicketByRange()));
        }
        return lottoTickets;
    }

    private List<LottoNumber> createLottoTicketByRange() {
        Collections.shuffle(lottoNumberRange);
        List<LottoNumber> lottoNumbers = lottoNumberRange.subList(START_INDEX, LOTTO_TICKET_SIZE);
        Collections.sort(lottoNumbers);
        return lottoNumbers;
    }
}