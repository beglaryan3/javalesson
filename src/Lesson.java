public class Lesson {
    public static void main(String[] args) {
        int x = 2, y = 10, z = 18, k = 26;

        //xndir21
        if (x > y && x > z) {
            System.out.println(x);
        } else if (y > x && y > z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }

        //xnidr22
        if (x < y && x < z) {
            System.out.println(x);
        } else if (y < x && y < z) {
            System.out.println(y);
        } else {
            System.out.println(z);
        }

        //xnidr23
        if (x == 1 || y == 1 || z == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //xdnir24
        if (x == 2 && y == 2 || x == 2 && z == 2 || y == 2 && z == 2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //xnidr25
        if (x + y > z && z + z > y && y + z > x) {
            System.out.println("y = 1");
        } else {
            System.out.println("y = 2");
        }


        //xnidr26
        if (x % 2 == 0 || y % 2 == 0 || z % 2 == 0) {
            System.out.println(1);
        } else {
            System.out.println(2);
        }

        //xnidr27
        if (y - x == z - y) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //xnidr28
        if (y / x == z / y) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //xnidr29
        if (x <= y && y <= z) {
            System.out.println(x + ", " + y + ", " + z);
        } else if (x <= z && z <= y) {
            System.out.println(x + ", " + z + ", " + y);
        } else if (y <= x && x <= z) {
            System.out.println(y + ", " + x + ", " + z);
        } else if (y <= z && z <= x) {
            System.out.println(y + ", " + z + ", " + x);
        } else if (z <= x && x <= y) {
            System.out.println(z + ", " + x + ", " + y);
        } else {
            System.out.println(z + ", " + y + ", " + x);
        }

        //xndir30
        if (x >= y && y >= z) {
            System.out.println(x + ", " + y + ", " + z);
        } else if (x >= z && z >= y) {
            System.out.println(x + ", " + z + ", " + y);
        } else if (y >= x && x >= z) {
            System.out.println(y + ", " + x + ", " + z);
        } else if (y >= z && z >= x) {
            System.out.println(y + ", " + z + ", " + x);
        } else if (z >= x && x >= y) {
            System.out.println(z + ", " + x + ", " + y);
        } else {
            System.out.println(z + ", " + y + ", " + x);
        }

        //xndir31
        if (x > y && x > z && x > k) {
            System.out.println(x);
        } else if (y > x && y > z && y > k) {
            System.out.println(y);
        } else if (z > x && z > y && z > k) {
            System.out.println(z);
        } else {
            System.out.println(k);
        }

        //xndir32
        if (x < y && x < z && x < k) {
            System.out.println(x);
        } else if (y < x && y < z && y < k) {
            System.out.println(y);
        } else if (z < x && z < y && z < k) {
            System.out.println(z);
        } else {
            System.out.println(k);
        }

        //xndir33
        if (x == 1 || y == 1 || z == 1 || k == 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //xndir34
        if (x + y == z + k || x + z == y + k || x + k == y + z) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //xndir35
        if (x == y + z + k || y == x + z + k || z == x + y + k || k == x + y + z) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //xndir36
        if (
                x % 2 == 1 && y % 2 == 1 ||
                        x % 2 == 1 && z % 2 == 1 ||
                        x % 2 == 1 && k % 2 == 1 ||
                        y % 2 == 1 && z % 2 == 1 ||
                        y % 2 == 1 && k % 2 == 1 ||
                        z % 2 == 1 && k % 2 == 1
        ) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //xndir37
        if (k - z == z - y && z - y == y - x) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //xndir38
        if (k / z == z / y && z / y == y / x) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        //xndir39
        if (x <= y && y <= z && z <= k) {
            System.out.println(x + ", " + y + ", " + z + ", " + k);
        } else if (x <= y && y <= k && k <= z) {
            System.out.println(x + ", " + y + ", " + k + ", " + z);
        } else if (x <= z && z <= y && y <= k) {
            System.out.println(x + ", " + z + ", " + y + ", " + k);
        } else if (x <= z && z <= k && k <= y) {
            System.out.println(x + ", " + z + ", " + k + ", " + y);
        } else if (x <= k && k <= y && y <= z) {
            System.out.println(x + ", " + k + ", " + y + ", " + z);
        } else if (x <= k && k <= z && z <= y) {
            System.out.println(x + ", " + k + ", " + z + ", " + y);
        } else if (y <= x && x <= z && z <= k) {
            System.out.println(y + ", " + x + ", " + z + ", " + k);
        } else if (y <= x && x <= k && k <= z) {
            System.out.println(y + ", " + x + ", " + k + ", " + z);
        } else if (y <= z && z <= x && x <= k) {
            System.out.println(y + ", " + z + ", " + x + ", " + k);
        } else if (y <= z && z <= k && k <= x) {
            System.out.println(y + ", " + z + ", " + k + ", " + x);
        } else if (y <= k && k <= x && x <= z) {
            System.out.println(y + ", " + k + ", " + x + ", " + z);
        } else if (y <= k && k <= z && z <= x) {
            System.out.println(y + ", " + k + ", " + z + ", " + x);
        } else if (z <= x && x <= y && y <= k) {
            System.out.println(z + ", " + x + ", " + y + ", " + k);
        } else if (z <= x && x <= k && k <= y) {
            System.out.println(z + ", " + x + ", " + k + ", " + y);
        } else if (z <= y && y <= x && x <= k) {
            System.out.println(z + ", " + y + ", " + x + ", " + k);
        } else if (z <= y && y <= k && k <= x) {
            System.out.println(z + ", " + y + ", " + k + ", " + x);
        } else if (z <= k && k <= x && x <= y) {
            System.out.println(z + ", " + k + ", " + x + ", " + y);
        } else if (z <= k && k <= y && y <= x) {
            System.out.println(z + ", " + k + ", " + y + ", " + x);
        } else if (k <= x && x <= y && y <= z) {
            System.out.println(k + ", " + x + ", " + y + ", " + z);
        } else if (k <= x && x <= z && z <= y) {
            System.out.println(k + ", " + x + ", " + z + ", " + y);
        } else if (k <= y && y <= x && x <= z) {
            System.out.println(k + ", " + y + ", " + x + ", " + z);
        } else if (k <= y && y <= z && z <= x) {
            System.out.println(k + ", " + y + ", " + z + ", " + x);
        } else if (k <= z && z <= x && x <= y) {
            System.out.println(k + ", " + z + ", " + x + ", " + y);
        } else {
            System.out.println(k + ", " + z + ", " + y + ", " + x);
        }

        //xndir40
        if (x >= y && y >= z && z >= k) {
            System.out.println(x + ", " + y + ", " + z + ", " + k);
        } else if (x >= y && y >= k && k >= z) {
            System.out.println(x + ", " + y + ", " + k + ", " + z);
        } else if (x >= z && z >= y && y >= k) {
            System.out.println(x + ", " + z + ", " + y + ", " + k);
        } else if (x >= z && z >= k && k >= y) {
            System.out.println(x + ", " + z + ", " + k + ", " + y);
        } else if (x >= k && k >= y && y >= z) {
            System.out.println(x + ", " + k + ", " + y + ", " + z);
        } else if (x >= k && k >= z && z >= y) {
            System.out.println(x + ", " + k + ", " + z + ", " + y);
        } else if (y >= x && x >= z && z >= k) {
            System.out.println(y + ", " + x + ", " + z + ", " + k);
        } else if (y >= x && x >= k && k >= z) {
            System.out.println(y + ", " + x + ", " + k + ", " + z);
        } else if (y >= z && z >= x && x >= k) {
            System.out.println(y + ", " + z + ", " + x + ", " + k);
        } else if (y >= z && z >= k && k >= x) {
            System.out.println(y + ", " + z + ", " + k + ", " + x);
        } else if (y >= k && k >= x && x >= z) {
            System.out.println(y + ", " + k + ", " + x + ", " + z);
        } else if (y >= k && k >= z && z >= x) {
            System.out.println(y + ", " + k + ", " + z + ", " + x);
        } else if (z >= x && x >= y && y >= k) {
            System.out.println(z + ", " + x + ", " + y + ", " + k);
        } else if (z >= x && x >= k && k >= y) {
            System.out.println(z + ", " + x + ", " + k + ", " + y);
        } else if (z >= y && y >= x && x >= k) {
            System.out.println(z + ", " + y + ", " + x + ", " + k);
        } else if (z >= y && y >= k && k >= x) {
            System.out.println(z + ", " + y + ", " + k + ", " + x);
        } else if (z >= k && k >= x && x >= y) {
            System.out.println(z + ", " + k + ", " + x + ", " + y);
        } else if (z >= k && k >= y && y >= x) {
            System.out.println(z + ", " + k + ", " + y + ", " + x);
        } else if (k >= x && x >= y && y >= z) {
            System.out.println(k + ", " + x + ", " + y + ", " + z);
        } else if (k >= x && x >= z && z >= y) {
            System.out.println(k + ", " + x + ", " + z + ", " + y);
        } else if (k >= y && y >= x && x >= z) {
            System.out.println(k + ", " + y + ", " + x + ", " + z);
        } else if (k >= y && y >= z && z >= x) {
            System.out.println(k + ", " + y + ", " + z + ", " + x);
        } else if (k >= z && z >= x && x >= y) {
            System.out.println(k + ", " + z + ", " + x + ", " + y);
        } else {
            System.out.println(k + ", " + z + ", " + y + ", " + x);
        }

    }

    ;


}
