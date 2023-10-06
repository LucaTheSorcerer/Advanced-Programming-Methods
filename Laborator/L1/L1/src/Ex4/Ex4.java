package Ex4;

import java.util.Arrays;
public class Ex4 {

    public static int findCheapestKeyboard(int[] keyboards) {
        Arrays.sort(keyboards);
        return keyboards[0];
    }

    public static int findMostExpensiveItem(int[] keyboards, int[] usbDrives) {
        int maxKeyboardPrice = Arrays.stream(keyboards).max().orElse(0);
        int maxUsbDrivePrice = Arrays.stream(usbDrives).max().orElse(0);

        return Math.max(maxKeyboardPrice, maxUsbDrivePrice);
    }
}
