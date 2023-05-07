class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int[] pre : prerequisites) {
            int course = pre[0];
            map.putIfAbsent(course, new ArrayList<>());
            map.get(course).add(pre[1]);
        }

        Set<Integer> visited = new HashSet<>();

        for(int i = 0; i < numCourses; i++) {
            if(!visited.contains(i)) { // no need to check the course that was visited
                if(!dfs(i, visited, new HashSet<>(), map)) return false;
            }
        }

        return true;
    }

    public boolean dfs(int i, Set<Integer> visited, Set<Integer> currVisited, Map<Integer, List<Integer>> map) {
        if(currVisited.contains(i)) return false; // when current course need a pre that was visited in current dfs traversal, the course is impossible to be register.

        if(!map.containsKey(i)) return true; // current course dont have pre

        currVisited.add(i);
        for(int pre : map.get(i)) {
            if(!visited.contains(pre)) {
                if(!dfs(pre, visited, currVisited, map)) return false;
            }
        }
        currVisited.remove(i);
        visited.add(i);

        return true;
    }
}