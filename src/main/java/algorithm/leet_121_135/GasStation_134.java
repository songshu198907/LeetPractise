package algorithm.leet_121_135;

/**
 * Created by songheng on 5/13/16.
 */
public class GasStation_134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int res = -1;
        int gasSum;
        for (int i = 0; i < gas.length; ) {
            if (gas[i] >= cost[i]) {
                gasSum = gas[i] - cost[i];
                int cnt = (i + 1) % gas.length;
                while (cnt != i) {
                    gasSum += gas[cnt] - cost[cnt];
                    if (gasSum < 0) {
                        break;
                    }
                    cnt = (cnt + 1) % gas.length;
                }
                if (cnt == i) {
                    return i;
                }
                if (cnt < i)
                    return -1;
                i = cnt++;

            } else
                i++;
        }

        return res;
    }
}
