import java.util.Arrays;

class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] res = new int[m][n];

        for (int[] a : res) {
            Arrays.fill(a, -1);
        }
        int i = 0;
        int j = 0;
        int h = n;
        int v = m - 1;
        int dir = 0;

        while (head != null) {
            if (dir == 0) {
                int c = h;
                int k = 0;
                while (k < c && head != null) {
                    res[i][j] = head.val;
                    k++;
                    j++;
                    head = head.next;
                }
                j--;
                i++;
                h--;

            } else if (dir == 1) {
                int c = v;
                int k = 0;
                while (k < c && head != null) {
                    res[i][j] = head.val;
                    k++;
                    i++;
                    head = head.next;
                }
                i--;
                j--;
                v--;
            } else if (dir == 2) {
                int c = h;
                int k = 0;
                while (k < c && head != null) {
                    res[i][j] = head.val;
                    k++;
                    j--;
                    head = head.next;
                }
                j++;
                i--;
                h--;
            } else if (dir == 3) {
                int c = v;
                int k = 0;
                while (k < c && head != null) {
                    res[i][j] = head.val;
                    k++;
                    i--;
                    head = head.next;
                }
                i++;
                j++;
                v--;
            }

            dir++;
            if (dir == 4) {
                dir = 0;
            }
        }

        return res;
    }
}