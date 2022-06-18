import java.util.Random;

public class DiceRollGlobal {

    Random random;
    int number;

    DiceRollGlobal(){
        random = new Random();
        roll();
    }

    void roll(){
        number=random.nextInt(6)+1;
        System.out.println(number);
    }
}
