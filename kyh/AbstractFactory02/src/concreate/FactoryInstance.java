package concreate;

import abst.GuiFac;
import mac.MacGuiFac;
import unix.UnixGuiFac;
import win.WinGuiFac;

public class FactoryInstance {
    private static String OS = System.getProperty("os.name").toLowerCase();

    public static GuiFac getGuiFac() {
        if (isWindows()) {
            return new WinGuiFac();
        } else if (isMac()) {
            return new MacGuiFac();
        } else {
            return new UnixGuiFac();
        }
    }

    private static boolean isWindows() {
        return (OS.contains("win"));
    }

    private static boolean isMac() {
        return (OS.contains("mac"));
    }

    private static boolean isUnix() {
        return (OS.contains("nix")
                || OS.contains("nux")
                || OS.contains("aix"));
    }

    private static boolean isSolaris() {
        return (OS.contains("sunos"));
    }
}
