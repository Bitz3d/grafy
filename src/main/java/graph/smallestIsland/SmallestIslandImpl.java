package graph.smallestIsland;

import java.util.HashSet;
import java.util.Set;

class SmallestIslandImpl {
    public static int smallestIsland(String[][] grid) {
        int minSize = Integer.MAX_VALUE;
        Set<String> visited = new HashSet<>();
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                int explore = explore(grid, row, column, visited);
                if (explore > 0 && explore < minSize) {
                    minSize = explore;
                }
            }
        }
        return minSize;

    }

    private static int explore(final String[][] grid,
                               final int row,
                               final int column,
                               final Set<String> visited) {
        if (outOfBoundPosition(grid, row, column)) return 0;
        if (grid[row][column].equalsIgnoreCase("W")) return 0;
        if (visited.contains(formatPointerPosition(row, column))) return 0;
        visited.add(formatPointerPosition(row, column));

        int size = 1;
        size += explore(grid, row - 1, column, visited);
        size += explore(grid, row + 1, column, visited);
        size += explore(grid, row, column - 1, visited);
        size += explore(grid, row, column + 1, visited);
        return size;
    }

    private static boolean outOfBoundPosition(final String[][] grid,
                                              final int row,
                                              final int column) {
        return !(0 <= row && row < grid.length) || !(0 <= column && column < grid[row].length);
    }

    private static String formatPointerPosition(final int row, final int column) {
        return String.format("%d,%d", row, column);
    }
}
