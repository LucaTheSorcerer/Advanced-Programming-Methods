package Ex4;

import java.util.Arrays;
public class Ex4 {

    public static int findCheapestKeyboard(int[] keyboards) {

        //exceptions

        if(keyboards == null) {
            throw new IllegalArgumentException("Array is null");
        }

        if (keyboards.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        Arrays.sort(keyboards);
        return keyboards[0];
    }

    public static int findMostExpensiveItem(int[] keyboards, int[] usbDrives) {

        //exceptions

        if(keyboards == null || usbDrives == null) {
            throw new IllegalArgumentException("Array is null");
        }

        if (keyboards.length == 0 || usbDrives.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int maxKeyboardPrice = Arrays.stream(keyboards).max().orElse(0);
        int maxUsbDrivePrice = Arrays.stream(usbDrives).max().orElse(0);

        return Math.max(maxKeyboardPrice, maxUsbDrivePrice);
    }

    //find the most expensive usb drive to buy based on a given budget
    public static int findMostExpensiveDrives(int[] drives, int budget) {

        //exceptions

        if(drives == null) {
            throw new IllegalArgumentException("Array is null");
        }

        if (drives.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        Arrays.sort(drives);
        for(int i = drives.length - 1; i >= 0; i--) {
            if(drives[i] <= budget) {
                return drives[i];
            }
        }

        return -1;
    }

    public static int calculateTotalCost(int budget, int[] keyboards, int[] usbDrives) {

        //exceptions

        if(keyboards == null || usbDrives == null) {
            throw new IllegalArgumentException("Array is null");
        }

        if (keyboards.length == 0 || usbDrives.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        Arrays.sort(keyboards);
        Arrays.sort(usbDrives);

        int maxCost = -1;

        for (int keyboard : keyboards) {
            for (int usbDrive : usbDrives) {
                int totalCost = keyboard + usbDrive;
                if (totalCost <= budget && totalCost > maxCost) {
                    maxCost = totalCost;
                }
            }
        }

        return maxCost;
    }

}
