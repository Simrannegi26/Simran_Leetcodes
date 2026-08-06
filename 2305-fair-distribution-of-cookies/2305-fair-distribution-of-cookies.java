class Solution {

    // Stores minimum unfairness found so far
    int ans = Integer.MAX_VALUE;

    public int distributeCookies(int[] cookies, int k) {

        // Array storing cookies received by each child
        int[] children = new int[k];

        // Start recursion from first cookie
        dfs(cookies, 0, children);

        return ans;
    }

    private void dfs(int[] cookies, int idx, int[] children) {

        // Base case
        if (idx == cookies.length) {

            int max = 0;

            // Find child having maximum cookies
            for (int x : children) {
                max = Math.max(max, x);
            }

            ans = Math.min(ans, max);
            return;
        }

        for (int i = 0; i < children.length; i++) {

            // Give current cookie to child i
            children[i] += cookies[idx];

            // Prune
            if (children[i] < ans)
                dfs(cookies, idx + 1, children);

            // Backtrack
            children[i] -= cookies[idx];

            // Symmetry optimization
            if (children[i] == 0)
                break;
        }
    }
}