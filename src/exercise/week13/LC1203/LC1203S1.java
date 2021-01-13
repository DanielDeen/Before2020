package exercise.week13.LC1203;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * @description: 1203.项目管理
 * @author: Daniel Deen
 * @create: 2021-01-12 00:03
 */

public class LC1203S1 {
    public int[] sortItems(int n, int m, int[] group, List<List<Integer>> beforeItems) {
        List<List<Integer>> groupItems = new ArrayList<>(); // 每个group下的项目成员
        List<Integer> groupIdList = new ArrayList<>(); // group id 列表
        List<List<Integer>> groupEdges = new ArrayList<>(); // group与group之间的连接边

        //此处为何是 m+n 呢？因为假设每个项目都无现有的group接管，则可直接延续m,创n个group id下标
        // 各个数据初始化
        for (int i = 0; i < n + m; i++) {
            groupItems.add(new ArrayList<>());
            groupIdList.add(i);
            groupEdges.add(new ArrayList<>());
        }

        // 项目与项目之间的连接边
        List<List<Integer>> itemEdges = new ArrayList<>();
        int lastGroup = m;
        for (int j = 0; j < n; j++) {
            itemEdges.add(new ArrayList<>());

            if (group[j] == -1) {
                group[j] = lastGroup;
                lastGroup++;
            }

            //把每个group下的项目放在一个list里
            groupItems.get(group[j]).add(j);
        }

        int[] itemDegree = new int[n];
        int[] groupDegree = new int[m + n];
        //建立图关系
        for (int k = 0; k < beforeItems.size(); k++) {
            int curGroup = group[k];
            for (int r = 0; r < beforeItems.get(k).size(); r++) {
                //为同一group内的项目则刷新项目入度数，建立被依赖关系，一个下标对着一个list，整个list依赖此下标项目
                int data = beforeItems.get(k).get(r);
                if (group[data] == curGroup) {
                    itemDegree[k]++;
                    itemEdges.get(data).add(k);
                } else {// 不为同一个group，则建立group 入度数和被依赖关系
                    groupDegree[curGroup]++;
                    groupEdges.get(group[data]).add(curGroup);
                }
            }
        }

        //获取 group之间的拓扑排序
        List<Integer> outsideSort = toSort(groupDegree, groupEdges, groupIdList);
        if (outsideSort.size() == 0) { //有循环，则返回空
            return new int[0];
        }

        List<Integer> ans = new ArrayList<>();
        for (Integer finGroup : outsideSort) {
            if (groupItems.get(finGroup).size() == 0) {
                continue;
            }
            List<Integer> insideSort = toSort(itemDegree, itemEdges, groupItems.get(finGroup));
            if (insideSort.size() == 0) {
                return new int[0];
            }

            ans.addAll(insideSort);
        }

        return ans.stream().mapToInt(Integer::valueOf).toArray();
    }

    public List<Integer> toSort(int[] degree, List<List<Integer>> edges, List<Integer> points) {
        List<Integer> res = new ArrayList<>();
        Queue<Integer> que = new LinkedList<>();
        for (Integer item : points) {
            if (degree[item] == 0) {
                que.offer(item);
            }
        }

        while (!que.isEmpty()) {
            Integer temp = que.poll();
            List<Integer> list = edges.get(temp);
            for (Integer ed : list) {
                degree[ed]--;
                if (degree[ed] == 0) {
                    que.offer(ed);
                }
            }
            res.add(temp);
        }

        //若有循环，则输出个数肯定会少于顶点个数
        return res.size() == points.size() ? res : new ArrayList<>();
    }
}
