package racing;

public class MoveRule {

    private final int moveCondition;

    public MoveRule(int moveCondition) {
        this.moveCondition = moveCondition;
    }

    public int makeValue() {
        return (int) (Math.random() * 10);
    }

    public int getMoveCondition() {
        return moveCondition;
    }
}