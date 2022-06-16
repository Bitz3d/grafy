package graph.islandCount;

import java.util.HashSet;
import java.util.Set;

class IslandCountImpl {
    public static int numbersOfIsland(String[][] grid) {
        int counter = 0;
        Set<String> visited = new HashSet<>();
        for (int row = 0; row < grid.length; row++) {
            for (int column = 0; column < grid[row].length; column++) {
                if (Boolean.TRUE.equals(explore(grid, row, column, visited))) {
                    counter++;
                }
            }
        }
        return counter;
    }

    private static boolean explore(final String[][] grid,
                            final int row,
                            final int column,
                            final Set<String> visited) {
        if (outOfBoundPosition(grid, row, column)) return false;
        if (grid[row][column].equalsIgnoreCase("W")) return false;
        if (visited.contains(formatPointerPosition(row, column))) return false;
        visited.add(formatPointerPosition(row, column));

        explore(grid, row - 1, column, visited);
        explore(grid, row + 1, column, visited);
        explore(grid, row, column - 1, visited);
        explore(grid, row, column + 1, visited);
        return true;
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
