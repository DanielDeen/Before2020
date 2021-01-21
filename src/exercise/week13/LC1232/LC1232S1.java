package exercise.week13.LC1232;

/**
 * @description: 1232.缀点成线
 * @author: Daniel Deen
 * @create: 2021-01-17 22:23
 */

public class LC1232S1 {
    public boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[0][0], y1 = coordinates[0][1];
        int x2 = coordinates[1][0], y2 = coordinates[1][1];
        if (x1 == x2) {
            for (int i = 2; i < coordinates.length; i++) {
                if (coordinates[i][0] != x1) {
                    return false;
                }
            }
            return true;
        }
        if (y1 == y2) {
            for (int i = 2; i < coordinates.length; i++) {
                if (coordinates[i][1] != y1) {
                    return false;
                }
            }
            return true;
        }
        double mate = (double)(y2 - y1) / (x2 - x1);
        for (int i = 2; i < coordinates.length; i++) {
            int x3 = coordinates[i][0], y3 = coordinates[i][1];
            double ma = (double)(y3 - y1) / (x3 - x1);

            if (Double.compare(ma, mate) != 0) {
                return false;
            }
        }
        return true;
    }
}
