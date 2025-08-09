# Can Place Flowers

## Problem Description

You have a flowerbed represented by an array of integers where:

- `0` means the plot is empty,
- `1` means the plot is already planted with a flower.

You want to plant `n` new flowers in the flowerbed without violating the rule that **no two flowers can be planted in adjacent plots**.

Return `true` if it is possible to plant `n` new flowers in the flowerbed without violating the no-adjacent-flowers rule; otherwise, return `false`.

---

### Example
Input: flowerbed = [1, 0, 0, 0, 1], n = 1
Output: true

## Explanation of the Code

- The program reads the size of the flowerbed array (`m`) and the flowerbed itself as input.
- It then reads the number of flowers (`n`) you want to plant.
- The `canPlaceFlowers` method iterates through each plot in the flowerbed:
  - For each empty spot (`0`), it checks the left and right neighbors.
  - The left neighbor is considered empty if:
    - The current plot is the first one (`i == 0`), or
    - The plot immediately to the left is empty (`flowerbed[i - 1] == 0`).
  - The right neighbor is considered empty if:
    - The current plot is the last one (`i == flowerbed.length - 1`), or
    - The plot immediately to the right is empty (`flowerbed[i + 1] == 0`).
- If both neighbors are empty (or do not exist), it means a flower can be planted safely at the current plot.
- The program then plants a flower (`flowerbed[i] = 1`) and increases the count of planted flowers.
- If at any point, the number of flowers planted equals or exceeds `n`, the method returns `true`.
- If the loop finishes and it is not possible to plant `n` flowers, the method returns `false`.


