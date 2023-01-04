## HashMap + HashSet + Map

#### LeetCode 874 - Walking Robot Simulation

Question:
A robot on an infinite XY-plane starts at point (0, 0) facing north. The robot can receive a sequence of these three possible types of commands:

    -2: Turn left 90 degrees.
    -1: Turn right 90 degrees.
    1 <= k <= 9: Move forward k units, one unit at a time.

Some of the grid squares are obstacles. The ith obstacle is at grid point obstacles[i] = (xi, yi). If the robot runs into an obstacle, then it will instead stay in its current location and move on to the next command.

Return the maximum Euclidean distance that the robot ever gets from the origin squared (i.e. if the distance is 5, return 25).

Note:

    North means +Y direction.
    East means +X direction.
    South means -Y direction.
    West means -X direction.

BrainStorming:

Setup a direction as a metrix int[][] direcxy = new int[][]{{0,1}, {1,0}, {0,-1}, {-1,0}}.

Then a direction (1-dim) variable is set to 0,1,2,3 representing turning directions. (Becuase it's easier to turn than 2-dims).

