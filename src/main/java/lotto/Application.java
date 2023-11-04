package lotto;

import java.util.ArrayList;
import java.util.List;
import camp.nextstep.edu.missionutils.Randoms;
import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
    }
    private static int inputPurchaseAmount(){
        System.out.println("구입금액을 입력해 주세요");
        int purchaseAmount = Integer.parseInt(Console.readLine());

        validPurchaseAmount(purchaseAmount);

        return purchaseAmount;
    }
    private static void validPurchaseAmount(int amount){
        if(amount % 1000 != 0) {
            throw new IllegalArgumentException("[ERROR] 구입금액은 1,000원 단위로 입력해야 합니다.");
        }
    }

    private static List<Lotto> generateLottos(int count){
        List<Lotto> lottos = new ArrayList<>();

        for(int i = 0; i<count; i++){
            lottos.add(new Lotto(generateRandomNumbers()));
        }
        return lottos;
    }
    private static List<Integer> generateRandomNumbers(){
        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(1, 45, 6);
        
        return numbers;
    }


}
