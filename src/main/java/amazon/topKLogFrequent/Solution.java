package amazon.topKLogFrequent;

import java.util.*;

/**
 * Created by daisyli on 2017/4/1.
 * 给两天的用户log数据，求两天均登录amazon的用户，follow up - log很大不可以放入内存
 * 相关问题：统计访问量最高的前10个ip，内存不够怎么办。统计最高的单词，内存不够。
 * （大数据处理，当内存不够的时候，考虑取模后映射成小文件，然后再用hash分别统计，然后再推排序）
 * Time is O(n*log(k))
 */
public class Solution {
    public List<Integer> topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num: nums) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        // create a min heap
        PriorityQueue<Pair> queue = new PriorityQueue<Pair>(k, new Comparator<Pair>() {
            public int compare(Pair a, Pair b) {
                return a.count - b.count;
            }
        });

        // maintain a heap of size k
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            Pair p = new Pair(entry.getKey(), entry.getValue());
            queue.offer(p);
            if (queue.size() > k) {
                queue.poll();
            }
        }

        // get all elements from the heap
        List<Integer> result = new ArrayList<>();
        while(queue.size() > 0) {
            result.add(queue.poll().num);
        }

        // reverse the order
        Collections.reverse(result);

        return result;
    }


}

class Pair {
    int num;
    int count;

    public Pair(int num, int count) {
        this.num = num;
        this.count = count;
    }
}


