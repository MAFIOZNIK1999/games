package games;

public class BonusGame {

    int countOnReel(int reelId, int symbolId) {
        return 0;
    }

    int countOnRow(int rowId, int symbolId) {
        return 0;
    }

    int countOnScreen(int symbolId) {
        return 0;
    }

    boolean startBonusGame() {
        if (countOnScreen(5) == 5) {
            return true;
        }
        if (countOnReel(1, 5) == 3
                || countOnReel(2, 5) == 3
                || countOnReel(3, 5) == 3
                || countOnReel(4, 5) == 3
                || countOnReel(5, 5) == 3) {
            return true;
        }
        if (countOnReel(1, 5) == countOnRow(2, 5)
                || countOnReel(3, 5) == countOnRow(2, 5)
                || countOnReel(5, 5) == countOnRow(2, 5)) {
            return true;
        }
        return false;
    }
}
