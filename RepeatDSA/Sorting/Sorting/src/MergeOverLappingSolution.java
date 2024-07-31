import java.util.Arrays;

public class MergeOverLappingSolution {


    static class Pair {
        int start;
        int end;

        public Pair(int s, int e) {
            start = s;
            end = e;
        }
    }


    void mergeOverlapping(Pair[] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals, (a, b) -> a.start - b.start);


        int res = 0;
        for (int i = 1; i < n; i++) {
            if (intervals[res].end >= intervals[i].start) {

                intervals[res].end = Math.max(intervals[res].end, intervals[i].end);
                intervals[res].start = Math.max(intervals[res].start, intervals[i].start);
            } else {
                res++;
                intervals[res] = intervals[i];
            }


        }
    }
}
