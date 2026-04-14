class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        int n = arr.length;

        while (i < n) {
            int correct = arr[i] - 1;

            if (arr[i] != arr[correct]) {
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        for (i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                ans.add(i + 1);
            }
        }

        return ans;
    }
}