import java.util.Arrays;

public class MeetMaximumGuests {


    int maxGuests(int[] arrrival, int[] departure) {
        int n = arrrival.length;
        int i = 1;
        int j = 0;
        int res = 1;
        int curr = 1;
        Arrays.sort(arrrival);

        Arrays.sort(departure);


        while (i < n && j < n) {
            if (arrrival[i] <= departure[j]) {
                i++;
                curr++;
            } else {
                j++;
                curr--;
            }
            res = Math.max(res, curr);

        }

        return res;

    }

}
