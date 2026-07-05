public class LogLevels {
    
    public static String message(String logLine) {
        int st = logLine.indexOf(':');
        String subStr = logLine.substring(st+1);
        String trimmed = subStr.trim();
        return trimmed;
    }

    public static String logLevel(String logLine) {
        int st = logLine.indexOf(']');
        String subStr = logLine.substring(1, st);
        String trimmed = subStr.trim();
        return trimmed.toLowerCase();
    }

    public static String reformat(String logLine) {
        String messageString = message(logLine); 
        String levelString = logLevel(logLine);
        return messageString+" ("+levelString+")";
    }
}
