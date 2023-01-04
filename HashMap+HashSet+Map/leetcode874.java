class Solution {
    public int robotSim(int[] commands, int[][] obstacles) {
        HashSet<String> obstaclesSet = new HashSet<>();
        int direction = 0;
        int x = 0, y =0;
        int result = 0;
        int[][] direcxy = new int[][]{{0,1}, {1,0}, {0,-1}, {-1,0}};

        for(int[] obs : obstacles) {
            obstaclesSet.add(obs[0] + "," + obs[1]);
        }

        for(int com : commands) {
            if (com == -2) {
                direction = (direction==0)? 3 : direction - 1;
            } else if (com == -1) {
                direction = (direction==3) ? 0: direction + 1;
            } else {
                while(com-- > 0 && !obstaclesSet.contains((x + direcxy[direction][0]) + "," + (direcxy[direction][1] + y))) {
                    x = x + direcxy[direction][0];
                    y = y + direcxy[direction][1];
                }
                result = Math.max(result, x*x + y*y);
            }
        }
        return result;

    }
}