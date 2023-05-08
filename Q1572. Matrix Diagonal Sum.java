class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0, l = 0, r = mat[0].length - 1;
        for(int i = 0; i < mat.length; i++) {
            sum += (l == r) ? mat[i][l] : (mat[i][l] + mat[i][r]);
            l++;
            r--;
        }

        return sum;
    }
}