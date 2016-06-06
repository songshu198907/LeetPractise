package algorithm.leet_181_end;

import java.util.*;

/**
 * Created by shu on 6/5/2016.
 */
public class The_Skyline_Problem_218_2 {
    public List<int[]> getSkyline(int[][] buildings) {
        List<int[]> result = new ArrayList<>();
        List<int[]> height = new ArrayList<>();
        // �����Σ�����������б�
        for(int[] b:buildings) {
            // �󶥵��Ϊ����
            height.add(new int[]{b[0], -b[2]});
            // �Ҷ����Ϊ����
            height.add(new int[]{b[1], b[2]});
        }
        // ���ݺ�������б�������ͬ������ĵ�������С������ǰ��
        Collections.sort(height, new Comparator<int[]>(){
            public int compare(int[] a, int[] b){
                if(a[0] != b[0]){
                    return a[0] - b[0];
                } else {
                    return a[1] - b[1];
                }
            }
        });
        // �����ѣ��������������жϴ�С
        Queue<Integer> pq = new PriorityQueue<Integer>(11, new Comparator<Integer>(){
            public int compare(Integer i1, Integer i2){
                return i2 - i1;
            }
        });
        // ����ƽ��ֵ9�ȼ������
        pq.offer(0);
        // prev���ڼ�¼�ϴ�keypoint�ĸ߶�
        int prev = 0;
        for(int[] h:height) {
            // ���󶥵�������
            if(h[1] < 0) {
                pq.offer(-h[1]);
            } else {
                // ���Ҷ����Ӧ���󶥵���ȥ
                pq.remove(h[1]);
            }
            int cur = pq.peek();
            // ����ѵ��¶������ϸ�keypoint�߶Ȳ�һ���������һ���µ�keypoint
            if(prev != cur) {
                result.add(new int[]{h[0], cur});
                prev = cur;
            }
        }
        return result;
    }
}
