package util.color;


public class ColorUtil {
    private static final String ANSI_RESET = "\u001B[0m";

    public static void showFormatted(String text, ColorEnum color, FormatEnum... formatEnums) {
        StringBuilder sb = new StringBuilder();
        sb.append(color != null ? color.getCode() : "");
        for (FormatEnum format : formatEnums) {
            sb.append(format != null ? format.getCode() : "");
        }
        sb.append(text).append(ANSI_RESET);
        System.out.println(sb);
    }
}
